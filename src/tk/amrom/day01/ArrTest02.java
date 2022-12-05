package tk.amrom.day01;

public class ArrTest02 {
    public static void main(String[] args) {
        /*
        练习：统计个数
        定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
         */

        //1、先定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义一个变量，用来统计循环次数
        int count = 0;
        //2、遍历每个元素
        for (int i = 0; i < arr.length; i++) {

            //3、判断哪些数字能被3整除
            if(arr[i] % 3 == 0){
                count++;
//               System.out.println(arr[i]);
           }
        }
        System.out.println("能被3整除的数字有" + count + "个");
    }
}
