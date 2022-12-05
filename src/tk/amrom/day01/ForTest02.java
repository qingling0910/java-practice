package tk.amrom.day01;

public class ForTest02 {
    public static void main(String[] args) {
        /*
        练习：断线重连
        需求：
        在实际开发中，需要重复执行的代码，会选择循环实现
        比如：如左图所示，玩游戏的时候，如果网不好，那么会经常断线重连
        那么断线重连这个业务逻辑需要重复执行
        假设现在公司要求，断线重连的业务逻辑最多只能写5次
        请用代码实现
        备注：断线重连的业务逻辑可以用输出语句替代

         */
        for(int i = 1; i <= 5; i++){
            System.out.println("第" + i + "次执行断线重连业务");
        }
    }
}
