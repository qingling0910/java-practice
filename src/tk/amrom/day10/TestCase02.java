package tk.amrom.day10;

import org.w3c.dom.ls.LSOutput;

import java.util.Enumeration;
import java.util.Scanner;

public class TestCase02 {
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
        //键盘录入
        Scanner sc = new Scanner(System.in);
        String str;

        while(true){
            System.out.println("请输入一个字符串：");
            str = sc.next();

            boolean flag = checkString(str);
            //2、校验字符串是否满足规则
            if(flag){
                break;
            }
            else{
                System.out.println("当前字符串不符合规则");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = changeLuoMa(c);
            sb.append(s);
        }
        System.out.println(sb);
    }


    public static String changeLuoMa(char number){
        String str ;
        switch (number){
            case '0' :
                str = "";
                break;
            case '1' :
                str = "Ⅰ";
                break;
            case '2' :
                str = "Ⅱ";
                break;
            case '3' :
                str = "Ⅲ";
                break;
            case '4' :
                str = "Ⅳ";
                break;
            case '5' :
                str = "Ⅴ";
                break;
            case '6' :
                str = "Ⅵ";
                break;
            case '7' :
                str = "Ⅶ";
                break;
            case '8' :
                str = "Ⅷ";
                break;
            case '9' :
                str = "Ⅸ";
                break;
            default:str = "";

        }
        return str;
    }

    public static boolean checkString(String str){
        //判断长度
        if(str.length() > 9){
            return false;
        }
        //判断是不是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
            return true;
    }
}
