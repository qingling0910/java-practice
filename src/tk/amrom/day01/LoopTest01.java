package tk.amrom.day01;

public class LoopTest01 {
    public static void main(String[] args) {
        /*
        练习：逢7过
        朋友聚会的时候可能会玩一个游戏：逢7过
        游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说：过
        需求：使用程序在控制台打印出1～100之间的满足逢七必过规则的数据
         */
        //分析：个位是7，十位是7，或者是7的倍数，三者满足一个即可
        for(int i = 1; i <=100; i++){
            if(i / 10 == 7 || i % 10 / 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);

        }
    }
}
