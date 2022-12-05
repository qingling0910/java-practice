package tk.amrom.day01;

public class Test03 {
    public static void main(String[] args) {
        /*
        目标：要能区分出什么时候使用带返回值的方法
        需求：定义方法，比较两个长方形的面积
         */
        double area1 = getArea(2.5, 3.5);
        double area2 = getArea(5.6, 6.8);
        if(area1 > area2){
            System.out.println("第一个长方形更大！");
        }else {
            System.out.println("第二个长方形更大！");
        }


    }
    public static double getArea(double len, double width){
        double result = len * width;
        return result;

    }
}
