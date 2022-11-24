package tk.amrom;

public class WhileTest02 {
    public static void main(String[] args) {
        /*
        练习；求商和余数
        需求：给定两个整数，被除数和除数（都是整数，且不超过int定范围）
        将两数相除，要求不使用乘法、除法和%运算符。
        得到商和余数
         */
        //定义一个变量，记录被除数
        int dividend = 100;
        //定义一个变量，记录除数
        int divisor = 12;
        //定义一个变量，记录商
        int count = 0;
        while(dividend > divisor){
            dividend=   dividend - divisor;
            count++;
        }
        System.out.println("商为" +count );
        System.out.println("余数为" + dividend);
    }
}
