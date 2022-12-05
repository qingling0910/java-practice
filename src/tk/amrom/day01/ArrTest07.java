package tk.amrom.day01;

public class ArrTest07 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，将数组中的0索引和最大索引的值交换
         */
        int[] arr ={1,2,3,4,5};
        arr[0] = 1;
        arr[4] = 5;
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println(arr[0]);
        System.out.println(arr[4]);
    }

}
