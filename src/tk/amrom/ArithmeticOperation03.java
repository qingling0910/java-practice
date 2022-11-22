package tk.amrom;

public class ArithmeticOperation03 {
    public static void main(String[]args){
        int x = 10;
        int y = x++;
        int z = ++x;

        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);
    }
}
