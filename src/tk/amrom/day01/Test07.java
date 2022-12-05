package tk.amrom.day01;

public class Test07 {
    public static void main(String[] args) {
        /*
        练习：判断是否存在
        需求：定义一个方法判断数组中的某一个数是否存在，如果存在，将结果返回给调用处
         */
        //定义数组
        int [] arr = {1,4,59,20,58,90};
        boolean flag = contain(arr, 20);
        System.out.println(flag);
    }
    public static boolean contain(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;

    }
}
