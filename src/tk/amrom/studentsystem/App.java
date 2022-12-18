package tk.amrom.studentsystem;

import java.util.ArrayList;
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
        System.out.println("忘记密码");
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

    //登录
    private static void login(ArrayList<User> list) {
        System.out.println("登录");
    }
}
