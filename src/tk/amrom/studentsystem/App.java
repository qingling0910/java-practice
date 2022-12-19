package tk.amrom.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //1、键盘录入用户名
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
       while (true){
           System.out.println("欢迎来到学生管理系统");
           System.out.println("请选择操作1登录 2注册 3忘记密码");

           System.out.println("请输入你的选择");
           String choose = sc.next();

           switch (choose){
               case "1" :
                   login(list);
                   break;

               case "2" :
                   register(list);
                   break;

               case "3":
                   forgetPassword(list);
                   break;

               case "4" :
                   System.out.println("谢谢使用，再见！");
                    System.exit(0);
               default:
                   System.out.println("没有这个选项");
           }
       }
    }
    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        //键盘录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(list,username);
        if(!flag){
            System.out.println("当前用户名" + username + "未注册，请先注册");
            return;
        }
        //键盘录入身份证号码、手机号码
        System.out.println("请输入身份证号码");
        String personId = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        //需要先把用户对象通过索引获取出来
            int index = findIndex(list,username);
            User user = list.get(index);

        //比较用户对象中的手机号码和身份证号码是否相同
            if(!(user.getPersonID().equalsIgnoreCase(personId) && user.getPhoneNumber().equals(phoneNumber) )){
                System.out.println("身份证号码或手机号输入有误，不能修改密码");
                return;
            }
            //当代码执行到此处，表示所有的数据全部验证成功，可以修改密码
        String password;
        while (true){
            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();

            if(password.equals(againPassword)){
                System.out.println("两次密码一致");
                break;
            }else {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }
        }
        //直接修改就可以了
        user.setPassword(password);
        System.out.println("密码修改成功");

    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }

    //注册
    private static boolean register(ArrayList<User> list) {
        //1、输入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            //先验证格式是否正确，再验证是否唯一
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("格式不满足条件，请重新输入用户名");
                continue;
            }

            //继续判断用户名是否唯一
            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("用户名" + username + "已存在，请重新输入");
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }
            //2、输入密码
            String password;
            while (true) {
                System.out.println("请输入密码");
                password = sc.next();
                System.out.println("请再次输入密码");
                String againPassword = sc.next();
                if (!password.equals(againPassword)) {
                    System.out.println("两次密码不一致，请重新输入");
                    continue;
                } else {
                    System.out.println("两次密码一致，请继续录入其他数据");
                    break;
                }
            }
            //3、键盘录入身份证号码
            String personId;
            while (true) {
                System.out.println("请输入身份证号码");
                personId = sc.next();
                boolean flag = checkPersonId(list, personId);
                if (flag) {
                    System.out.println("身份证格式正确");
                    break;
                } else {
                    System.out.println("身份证格式不正确，请重新录入");
                    continue;
                }

            }

            //4、输入手机号
            String phoneNumber;
             while (true){
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(list,phoneNumber);
            if(flag){
                System.out.println("手机号码格式正确");
                break;
            }else {
                System.out.println("手机号码格式有误，请重新输入");
                continue;
            }
        }
             //将用户名、密码、身份证号码、电话号码放入对象中
            User u = new User(username, password, personId, phoneNumber);

             //将对象添加至集合中
            list.add(u);
        System.out.println("注册成功");

        //遍历集合
        printList(list);

        return false;
    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " +
                    user.getPersonID() + ", " + user.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(ArrayList<User> list, String phoneNumber) {
        //长度为11位
        if(phoneNumber.length() != 11){
            return false;
        }
        //不能以0为开头
        if(phoneNumber.startsWith("0")){
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }

        }
        return true;

    }

    private static boolean checkPersonId(ArrayList<User> list, String personId) {
        //长度为18位
        if(personId.length() != 18){
            return false;
        }
        //不能以0为开头
        if(personId.startsWith("0")){
            //如果以0开头，返回false
            return false;
        }

        //前17位，必须都是数字
        for (int i = 0; i < personId.length() - 1; i++) {
           char c =  personId.charAt(i);
           if(!(c >= '0' && c <= '9')){
                return false;
           }

        }
        //最为一位可以是数字，也可以是大写X或小写x
        char endChar = personId.charAt(personId.length() - 1);
        if((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')){
            return true;
        }else {
            return false;
        }
    }

    private static boolean contains(ArrayList<User> list, String username) {
        //循环遍历得到每一个元素
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rigthUsername = user.getUsername();
            if(rigthUsername.equals(username)){
                return true;
            }
        }
        return false;
    }

    private static boolean checkUsername(String username) {
        //用户名长度必须在3~15位之间
        int len = username.length();
        if(len < 3 || len > 15){
            return false;
        }
        //代码执行到这里，说明用户名长度在3～15之间
        //只能是字母加数字的组合
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))){
                return false;
            }
        }
        //当代码执行到这里，说明用户名满足两个条件：1、长度满足；2、内容满足
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                count++;
                break;
            }
        }
                return count > 0;
//        用户名唯一
//        用户名长度必须在3~15位之间
//        ，但是不能是纯数字
    }

    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字符
            char c = list.get(index);
            //把随机字符添加到sb当中
            sb.append(c);
        }
        //把一个随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);

        //如果我们要修改字符串中的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的数组
        char[] arr = sb.toString().toCharArray();
        //拿最后一个索引，跟随机索引进行交换
        int randonmIndex = r.nextInt(arr.length);
        //最大索引指向元素，跟随机索引指向的元素交换
        char temp = arr[randonmIndex];
        arr[randonmIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }

    //登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();

            //判断用户是否存在
            boolean flag = contains(list,username);
            if(!flag){
                System.out.println("用户名" + username + "未注册，请先注册再登录");
                return;
            }
            System.out.println("请输入密码");
            String password = sc.next();

            //输入验证码
            while (true){
                String rigntCode = getCode();
                System.out.println("当前的验证码为" + rigntCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if(code.equalsIgnoreCase(rigntCode)){
                    System.out.println("验证码正确");
                    break;
                }else {
                    System.out.println("验证码错误");
                    continue;
                }
            }
            //验证用户名和密码是否正确
            //即集合中是否包含用户名和密码
            //定义一个方法验证用户名和密码

            //封装思想的应用：
            //我们可以把一些零散的数据，封装成一个对象
            //以后传递参数的时候，只要传递一个整体就可以了
            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list,userInfo);
            if(result){
                System.out.println("登录成功，可以开始使用学生管理系统了");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
            }else {
                System.out.println("登录失败，用户名或密码错误");
                if(i == 2){
                    System.out.println("当前账号" + username + "被锁定，请联系客服");
                    return;
                }else{
                    System.out.println("用户名或密码错误，还剩" + (2 - i) + "次机会" );
                }
            }
        }
    }

    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        //遍历集合，查看用户名、密码是否存在
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())){
                return true;
            }
        }
        return false;
    }

}
