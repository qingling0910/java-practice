package tk.amrom.day01;

public class MethodDemo05 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法，求一家商场每个季度的营业额
        根据方法结果在计算出全年营业额
         */

        //目标：掌握带返回值方法的定义和调用格式
        //直接调用
        getSum(10,20,30);


        //赋值调用
        int sum =  getSum(10,20,30);
        System.out.println(sum);

        //输出调用
        System.out.println(getSum(10,20,30));
    }
    public static int getSum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;

    }
}
