package tk.amrom;

public class Test06 {
    public static void main(String[] args) {
        /*
        需求：设计一个方法求数组的最大值，并将最大值返回
         */
        //定义数组
        int [] arr = {1,3,6,9,25};
        int max = getMax(arr);

        System.out.println(max);
    }
    public static int getMax(int [] arr ){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max ){
                max = arr[i];
            }

        }
        return max;


    }

}
