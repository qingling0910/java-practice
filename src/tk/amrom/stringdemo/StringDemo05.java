package tk.amrom.stringdemo;

import java.security.cert.CertificateParsingException;
import java.util.Scanner;

public class StringDemo05 {
    public static void main(String[] args) {
        /*
        金额转换
        将2135转换为
        零佰零拾零万贰仟壹佰叁拾伍
         */
        //1、键盘录入金额
        Scanner sc = new Scanner(System.in);
        int money;
        while(true){
            System.out.println("请输入金额：");
            money = sc.nextInt();
            //1.1 判断金额是否有效
            if(money >= 0 && money <= 999999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }
        //定义一个变量，用来记录数字的大写
        String moneyStr = "";
        //2、得到money里面的每一位数字，再转成中文大写
        while(true){
            //从左往右依次获取数据，因为右侧的数据是个位
            int ge = money % 10;
            //把转换之后的大写拼接到moneystr中
            String CapitalNumber = getCapitalNumber(ge);
            moneyStr = CapitalNumber + moneyStr;
            //去掉刚刚获取的数据
            money = money / 10;

            if(money == 0){
                break;
            }
        }

        //3、在前面补0，补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr =  "零" + moneyStr;
        }
        System.out.println(moneyStr);


        //4、插入单位
        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    //定义一个方法，将数字转换为大写数额
    public static String getCapitalNumber(int number){
        //定义数组，让数字跟大写的中文产生一个练习
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];

    }
}
