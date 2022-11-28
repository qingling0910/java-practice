package tk.amrom;

public class ArrTest04 {
    public static void main(String[] args) {
        /*
        求最值
        需求：已知数组元素为[33, 5, 22, 44, 55]
        请找出数组中最大值并打印在控制台
         */


        //1、定义数组
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[1];
        //2、遍历数组
        for (int i = 0; i < arr.length; i++) {
            //3、比较
            if(arr[i] > max){
                max = arr[i];

            }
        }
        System.out.println(max);

    }
}
