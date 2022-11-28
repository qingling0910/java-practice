package tk.amrom;

public class ArrTest06 {
    public static void main(String[] args) {
        /*
        交换数据
         */
        int a = 10;
        int b = 20;

        //定义一个临时变量记录a原来的值
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);


    }
}
