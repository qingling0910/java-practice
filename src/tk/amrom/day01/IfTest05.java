package tk.amrom.day01;

import java.util.Scanner;

public class IfTest05 {
    public static void main(String[] args) {
        /*
        1、95～100分，奖励一辆自行车；
        2、90～94分，游乐场玩一天；
        3、80～89分，变形金刚；
        4、80分以下，揍一顿
         */
        //1、键盘录入小明的成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩：");

        int score = sc.nextInt();
        //判断成绩
        if(score > 0 && score <= 100){
            if(score >= 95 && score <= 100){
                System.out.println("奖励一辆自行车");
            }else if(score >= 90 && score <= 94){
                System.out.println("游乐场玩一天");
            }else if(score >= 80 && score <= 89){
                System.out.println("变形金刚");
            }else {
                System.out.println("揍一顿");
            }

        }else{
            System.out.println("当前录入的成绩不合理");
        }

    }
}
