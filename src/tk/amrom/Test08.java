package tk.amrom;

public class Test08 {
    public static void main(String[] args) {
        /*
        练习：复制数组
        需求：
        定义一个方法copyOfRange(int[] arr, int from, int to)
        功能：
        将数组arr中从索引from（包含from）开始
        到索引to结束（不包含to）到元素复制到新数组中
        将新数组返回
         */
        //定义原始数组
        int [] arr = {1,2,3,4,5,6,7,8,9};
       int[] copyArr =  copyOfRange(arr,3,7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");

        }
    }
    //构造方法
    public static int[] copyOfRange(int[] arr, int from, int to){
        //定义新的数组，动态
        int[] newArr = new int [to - from];
        //定义索引
        int index = 0;
        for (int i = from; i <to; i++) {
            //往数组中添加元素
            newArr[index] = arr[i] ;
            index++;

        }
        return newArr;

    }

}
