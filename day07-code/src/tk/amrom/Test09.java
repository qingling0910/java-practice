package tk.amrom;

import java.util.Random;

public class Test09 {
    public static void main(String[] args) {
        /*
        练习：抢红包
        需求：一个大V直播抽奖，奖品是现金红包，分别有{2, 588, 888, 1000, 10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项大出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面大顺序）
         */
        //分析：1、定义数组，记录奖金池
        int []arr = {2, 588, 888, 1000, 10000};
        //2、定义新的数组，记录抽奖后的元素
        int [] newArr = new int[arr.length];
        //3、抽奖
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            boolean flag = contains(newArr,prize);
            if(!flag){
                newArr[i] = prize;
                i++;
            }
        }
        //4、遍历新的数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static boolean contains(int []arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }
        }
        return false;


    }
}
