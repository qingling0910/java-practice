package tk.amrom.day01;

import javax.print.attribute.standard.PresentationDirection;

public class WhileTest01 {
    public static void main(String[] args) {
        /*
        练习：回文数
        需求：如果 X 是一个回文整数，打印true，否则返回false
        解释：回文数是指正序（从左到右）和倒序（从右到左）读都是同一个数
        例如：121是回文数，123不是回文数

         */
        //定义一个变量记录回文整数初始值
       int x = 121;
       //定义一个变量，记录x原来的值
        int temp = x;
       //定义一个变量记录倒过来的数
       int num = 0;
       while(x != 0){
           int ge = x % 10;
           x = x / 10;
           num = num * 10 + ge;

       }
        System.out.println(num);
        System.out.println(num == temp);
    }
}
