package tk.amrom.day01;

public class ArrTest01 {
    public static void main(String[] args) {
        /*
        练习：遍历数组并求和
        定义一个数组，存储1，2，3，4，5
        遍历数组得到每一个元素，求数组里面所有的数据和
         */
        //定义数组
        int[] arr ={1,2,3,4,5};
        //求和
        //定义变量存储所有数组元素的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}
