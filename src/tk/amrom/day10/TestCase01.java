package tk.amrom.day10;

import java.util.Scanner;

public class TestCase01 {
    public static void main(String[] args) {
        /*
        练习：转换罗马数字
        键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
        将内容编程罗马数字
        下面是阿拉伯数字和罗马数字的对比关系：
        Ⅰ - 1、 Ⅱ - 2、Ⅲ - 3、Ⅳ - 4、Ⅴ - 5、Ⅵ - 6、Ⅶ - 7、Ⅷ - 8、Ⅸ - 9
        注意点：罗马数字中没有0
        如果键盘录入的数字包含0，可以变称""（长度为0的字符串）
         */
        //1、键盘录入
        Scanner sc = new Scanner(System.in);
        String str;

        while (true){
            System.out.println("请输入一个字符串：");
             str = sc.next();

            //2、校验字符串是否满足规则
            boolean flag = checkString(str);
            if(flag){
                break;
            }else {
                System.out.println("当前的字符串不符合规则，请重新输入");
                continue;
            }
        }
        //将内容编程罗马数字
        //查表法：数字跟数据产生一个对应关系
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeLuoMa(number);
            sb.append(s);
        }
        System.out.println(sb);

    }

    public static String changeLuoMa(int number){
        //定义数组，让索引跟罗马数字产生一个对应关系
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }
    public static boolean checkString(String str){
        //判断长度大于9
        if(str.length() > 9){
            return false;
        }
        //判断只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        //只有当字符串里面所有的字符全部判断完毕，才能认为当前的字符串符合规则
        return true;
    }

}
