package tk.amrom;
/*
需求：简化自动驾驶的判断
 */
public class IfTest07 {
    public static void main(String[]args){
        boolean isLightRed = true;
        boolean isLightGreen = false;
        boolean isLightYellow = false;

        if (isLightRed){
            System.out.println("stop!!!");
        }else if (isLightGreen){
            System.out.println("GOGOGO!!!");
        }else if (isLightYellow){
            System.out.println("slow!!!");
        }
    }
}
