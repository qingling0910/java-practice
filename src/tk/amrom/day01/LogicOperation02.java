package tk.amrom.day01;

public class LogicOperation02 {
    public static void main(String[]args){
        //&&
        //运行结果与单个&是一样的
        //表示两边都为真，结果才是真
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        System.out.println("-------------------");

        //||
        //运行结果和单个｜是一样的
        //表示两边都为假，结果才是假

        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//false
        System.out.println(false || true);//false

    }
}
