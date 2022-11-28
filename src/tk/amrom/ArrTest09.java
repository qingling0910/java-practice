package tk.amrom;

import java.util.Random;

public class ArrTest09 {
    public static void main(String[] args) {
        /*
        练习：打乱数组中的数据
        需求：定义一个数组，存1～5
        要求打乱数组中所有的数据的顺序
         */
        int[] arr = {1,2,3,4,5};
        //生成随机索引
        Random r = new Random();

        for(int i = 0; i < arr.length; i++){
            int Randomindex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[Randomindex];
            arr[Randomindex] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
