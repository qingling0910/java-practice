package tk.amrom.test07;

public class GameTest {
    public static void main(String[] args) {
        //1、创建第一个角色
        Role r1 = new Role("乔峰",100,'男');
        //2、创建第二个角色
        Role r2 = new Role("鸠摩智", 100,'男');

        r1.showRoleInfo();
        r2.showRoleInfo();

        //3、开始格斗，回合游戏
        while(true){
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O 了" + r2.getName());
                break;
            }
            //r2开始攻击r1
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O 了" + r1.getName());
                break;
            }
        }
    }
}
