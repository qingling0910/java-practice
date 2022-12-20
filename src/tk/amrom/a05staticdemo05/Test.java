package tk.amrom.a05staticdemo05;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();


        System.out.println("===============");

        Husky hu = new Husky();
        hu.eat();
        hu.drink();
        hu.lookHome();
        hu.destoryHome();


    }
}
