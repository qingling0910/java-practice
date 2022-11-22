package tk.amrom;

/*
需求：
您和您的约会对象在餐厅里面约会。
键盘录入两个整数，表示你和约会对象衣服的时髦度。（手动录入0～10之间的整数，不能录其他）
如果你的时髦度大于约会对象的时髦度，相亲成功，输出true
否则输出false
 */

import java.util.Scanner;

public class AssignmentPractice01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我衣服的时髦度：");
        int myFashion = sc.nextInt();

        int grilFashion = sc.nextInt();
        System.out.println("请输入相亲对象的衣服时髦度：");

        boolean  result = myFashion > grilFashion;

        System.out.println(result);
    }

}
