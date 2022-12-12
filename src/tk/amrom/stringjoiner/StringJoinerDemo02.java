package tk.amrom.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo02 {
    public static void main(String[] args) {
        //1、创建对象
        StringJoiner sj = new StringJoiner(", " , "[" , "]");


        //2、添加元素
        sj.add("aaa").add("bbb").add("ccc").add("ddd");

        //3、打印
        System.out.println(sj); //[aaa, bbb, ccc, ddd]

        int len = sj.length();
        System.out.println(len); //20

       String str = sj.toString();
        System.out.println(str); //[aaa, bbb, ccc, ddd]


    }
}
