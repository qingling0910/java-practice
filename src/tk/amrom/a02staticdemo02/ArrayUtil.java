package tk.amrom.a02staticdemo02;
/*
练习：定义数组工具类
需求：
在实际开发中，经常会遇到一些数组使用的工具类
请按照如下要求编写一个数组的工具类：ArrayUtil

提供一个工具类方法printArr，用于返回整数数组的内容
返回的字符串格式如：[10, 20, 50, 34, 100]（只考虑整数数组，且只考虑一维数组）
提供这样一个工具方法getAerage，用于返回平均分。（只考虑赋点类型，且只考虑一维数组）
定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。
 */

public class ArrayUtil {
    //私有化构造方法
    //目的：为了不让外界构建她的对象
    private ArrayUtil(){

    }
    //需要定义为静态的，方便调用
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}
