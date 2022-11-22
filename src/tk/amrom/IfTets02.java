package tk.amrom;

public class IfTets02 {
    public static void main(String[]args){
        /*问题：自动驾驶
        1、汽车无人驾驶会涉及到大量的判断
        2、当汽车行驶的时候遇到了红绿灯，就会进行判断
        1）如果红灯亮，就停止
        2）如果黄灯亮，就减速
        3）如果绿灯亮，就形势
         */
        //分析：先定义3个变量表示等的状态
        //true：亮；false：灭
        boolean isLightRed = true;
        boolean isLightGreen = false;
        boolean isLightYellow = false;

        if (isLightRed){
            System.out.println("stop!!!");
        }

        if (isLightGreen){
            System.out.println("GOGOGO!!!");
        }

        if (isLightYellow){
            System.out.println("slow!!!");
        }

    }
}
