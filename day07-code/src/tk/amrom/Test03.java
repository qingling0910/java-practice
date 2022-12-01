package tk.amrom;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        /*
        练习：开发验证码
        需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字
         */
        //分析：1、随机生成 Random
        //2、大写字母或者小写字母  ASCII码表
        //3、最后一位是数字  随机生成数字  拼接
        char [] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25){
                chs[i] = (char)(97 + i);
            }else{
                chs[i] = (char)(65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];

        }
        int nubmer = r.nextInt(10);
        result = result + nubmer;
        System.out.println(result);
    }
}
