package tk.amrom.day01;

public class MethodDemo04 {
    public static void main(String[] args) {
        //需求：掌握带参数方法的定义格式和调用格式
        getSum(10,20);

    }
    public static void getSum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
