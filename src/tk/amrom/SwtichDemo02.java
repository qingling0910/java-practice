package tk.amrom;

public class SwtichDemo02 {
    public static void main(String[] args) {
        //case穿透
        int number = 10;
        switch (number){
            case 1:
                System.out.println("number的值为1");
            case 10:
                System.out.println("number的值为10");
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1，10或者20");
        }
    }
}
