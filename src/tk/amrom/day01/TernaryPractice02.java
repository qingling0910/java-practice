package tk.amrom.day01;

/*
需求：
一座寺庙里住着三个和尚，已知他们的身高分别为150cm，210cm，165cm
请用程序实现获取这三个和尚的最高身高
 */
public class TernaryPractice02 {
    public static void main(String[]agrs){

        //定义3个变量
       int height01 = 150;
       int height02 = 210;
       int height03 = 165;

       //先将第一个和第二个比较，得出一个结果，赋值给max1
       int max1 = height01 > height02 ? height01 : height02;
       //将第一步的结果max1和第三个数比较
       int max = max1 > height03 ? max1 : height03;

       System.out.println(max);


    }
}
