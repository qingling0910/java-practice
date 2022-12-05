package tk.amrom.day01;

public class SkiploopDemo01 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("小老虎在吃" + i + "个包子");
        }
    }
}
