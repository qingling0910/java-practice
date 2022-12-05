package tk.amrom.day01;

public class Test01 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法，求长方形的周长，将结果在方法中进行打印
        目标：根据不同的需求，选择定义无参的方法，还是带参数的方法
         */
        getLength(5.2, 1.3);
    }
    public static void getLength(double len, double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
