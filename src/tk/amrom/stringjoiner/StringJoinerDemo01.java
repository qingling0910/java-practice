package tk.amrom.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo01 {
    public static void main(String[] args) {
        //1、创建对象
        StringJoiner sj = new StringJoiner("-----");

        //2、添加元素
        sj.add("aaa").add("bbb").add("ccc").add("ddd");

        //3、打印结果
        System.out.println(sj);
    }
}
