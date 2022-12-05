package tk.amrom.day01;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //数组
        //完整格式：数据类型[] 数组名 = new 数据类型[]{element1, element2....};
        //简化格式：数据类型[] 数组名 = {element1, element2....};

        //需求1；定义数组存储5个学生的年龄
        int[] arr1 =new int[]{11,12,13,14,15};//完整格式
        int[] arr2 = {11,12,13,14,15};//简化格

        //需求2：定义数组存储3个学生的姓名
        String[] arr3 = new String[]{"张三","李四","王五"};//完整格式
        String[] arr4 = {"张三","李四","王五"};//简化格

        //需求3：定义数组存储4个学生的身高
        double[] arr5 = new double[]{1.54,1.60,1.80,1.75};//完整格式
        double[] arr6 = {1.54,1.60,1.80,1.75};//简化格

    }
}
