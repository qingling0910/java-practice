package tk.amrom;

public class ArrayDemo04 {
    public static void main(String[] args) {
        /*
        定义一个数组，用来存班级中50个学生的姓名
        姓名未知，等学生报道后，再进行添加
         */
        //格式：
        //数据类型 [] 数组名 = new 数据类型 [数组长度];
        //在创建等时候，由我们给出数组等长度，由虚拟机给出默认的初始化值
        String [] arr = new String[50];
        //添加学生
//        arr[0] = "zhangsan";
//        arr[1] ="lisi";
//        //获取
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
        //整数类型的数组
        int [] arr1 = new int[3];
        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
    }
}
