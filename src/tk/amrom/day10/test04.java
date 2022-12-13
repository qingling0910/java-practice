package tk.amrom.day10;

import java.util.Random;

public class test04 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        规则：
        长度为5
        内容中是四位字母，1位数字
        其中数字只有1位，但是可以出现在任意的位置
         */
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            //添加小写字母
            if(i <= 25){
                chs[i] = (char)(97 + i);
            }else{
                //添加大写字母 A ---65
                chs[i] = (char)(65 + i -26);
            }
        }
        //定义一个字符串类型的变量，用来记录最终的结果
        String code = "";

        //2、随机抽取4次
        //随机抽取数组中的索引
        Random r = new Random();
        for(int i = 0; i < 4; i++){
           int randmIndex = r.nextInt(chs.length);
           //利用随机索引，获取对应的元素
//            System.out.println(chs[randmIndex]);
            code = code + chs[randmIndex];
        }

        //3、随机抽取一个数字0～9
        int number = r.nextInt(10);
        code = code + number;

        //4、变成字符数组打乱数据
        char[] arr = code.toCharArray();
        //将里面的内容打乱
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //将字符数组再变为字符串
        String result = new String(arr);
        //输出打印
        System.out.println(result);

    }
}
