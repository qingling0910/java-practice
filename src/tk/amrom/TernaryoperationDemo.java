package tk.amrom;

public class TernaryoperationDemo {
    public static void main(String[]args){
        //需求：使用三元运算符，获取两个数的较大值

        //分析：
        //1、定义两个变量记录两个整数
        int number1 = 10;
        int number2 = 20;

        int max = number1 > number2 ? number1 : number2;
        System.out.println(max);

        System.out.println("打印另一种形式的结果如下：");

        System.out.println(number1 > number2 ? number1 : number2);

    }
}
