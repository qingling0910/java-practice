package tk.amrom;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*
        练习：评委打分
        需求：
        在唱歌比赛中，有6名评委给选手打分，分数范围是[0～100]之间的整数，选手的最后得分：
        去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分
         */
        //分析：1、6个评委打分 数组 长度为6；
        //2、不知道具体分数  键盘录入
        //3、求最高分
        //4、求最低分
        //5、平均分 = （6个分数 - 最高分 - 最低分）/ 4
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //求数组中的最大值
        int max = getMax(scoreArr);

        //求数组中的最小值
        int min = getMin(scoreArr);

        //求数组的和
        int sum = getSum(scoreArr);

        //求数组的平均数
        int avg = (sum - max - min ) / (scoreArr.length - 2);
        System.out.println("选手最终得分" + avg);
    }
    //求数组的和
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }
    //求数组的最大值
    public static int getMax(int[] scoreArr){
         int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }
    //  求数组最小值
    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] < min){
                min = scoreArr[i];
            }

        }
        return min;
    }

    public static int[] getScores(){
        //定义数组
        int[] scores = new int [6];
        //键盘录入分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委打分：");
            int score = sc.nextInt();
            if(score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else{
                System.out.println("成绩不在范围内");
            }
        }
        return scores;

    }
    }

