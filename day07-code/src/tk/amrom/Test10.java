package tk.amrom;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
         /*
        练习：抢红包
        需求：一个大V直播抽奖，奖品是现金红包，分别有{2, 588, 888, 1000, 10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项大出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面大顺序）
         */
        //分析：1、打乱奖金池的顺序，再遍历数组
        int []arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
