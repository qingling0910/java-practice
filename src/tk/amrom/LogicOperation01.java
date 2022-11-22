package tk.amrom;

import java.sql.SQLOutput;

public class LogicOperation01 {
    public static void main(String[]args){
        //并且
        //两边都为真，结果才是真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);

        System.out.println("-----------");

        //或者
        //两边都为假，结果才是假
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);

        System.out.println("---------");

        //异或
        //相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println("----------");

        //取反
        System.out.println(!true);
        System.out.println(!false);

        //取反

    }

}
