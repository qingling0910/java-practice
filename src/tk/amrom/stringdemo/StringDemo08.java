package tk.amrom.stringdemo;

public class StringDemo08 {
    public static void main(String[] args) {
        /*
        敏感词替换
         */
        //1、获取到说的话
        String talk = "你玩的很好，以后不要再玩了，TMD,SB";

        //2、敏感词库
        String[] arr = {"TMD", "CNM", "SB"};

        //3、替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }


        //4、打印结果
        System.out.println(talk);

    }
}
