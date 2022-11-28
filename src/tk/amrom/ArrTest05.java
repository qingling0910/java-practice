package tk.amrom;

import java.util.Random;

public class ArrTest05 {
    public static void main(String[] args) {
        /*
        练习：遍历数组求和
        需求：生成10个1～100之间的随机数
        1）求出所有数据之和
        2）求出所有数据的平均数
        3）统计有多少个数据比平均值小
         */
        //1、定义数组
        int[] arr = new int[10];

        //2、获取随机数
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        //2、求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        //打印随机数的和
        System.out.println("所有随机数的和为" + sum);
        //3、求平均数
        int avg = sum / arr.length;
        System.out.println("所有随机的平均值为" + avg);
        //4、统计数值
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("所有随机数中有" + count + "个数据比平均值小");


        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        }
    }



