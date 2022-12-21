package tk.amrom.a06staticdemo06;

import com.sun.security.jgss.GSSUtil;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu{
    String name = "Fu";
    String hobby = "喝茶";

}

class Zi extends Fu{
    String name = "Zi";
    String game = "吃鸡";

    public void show(){
        //打印Zi
        System.out.println(name);
        System.out.println(this.name);

        //打印Fu
        System.out.println(super.name);

        //打印喝茶
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);

        //打印吃鸡
        System.out.println(game);
        System.out.println(this.game);
    }
}
