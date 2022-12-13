package tk.amrom.day10;

import java.util.Random;
import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        /*
        键盘录入任意字符串，打乱里面的内容
         */
        //1、键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2、打乱里面的内容
        //修改字符串里面的内容
        //subString
        //变成字符数组
       char[] arr = str.toCharArray();

       //3、打乱数组里面的内容
        //从0索引开始，跟一个随机索引进行位置的交换
        //当数组里面的每一个元素都跟一个随机索引进行交换完毕之后，那么内容就打乱了
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
           int index = r.nextInt(arr.length);
           char temp = arr[i];
           arr[index] = temp;
        }

        //4、把字符串再变回字符串
        String newStr = new String(arr);

        //5、输出打印
        System.out.println(arr);
    }
}
