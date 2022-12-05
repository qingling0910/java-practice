package tk.amrom.day01;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //获取数组值
        int number = arr[0];
//        System.out.println(number);
        //把数据存储到数组当中
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
