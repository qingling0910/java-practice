package tk.amrom.interfacetest;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青蛙", 1);
        System.out.println(f.getName() + ", " + f.getAge());

        f.eat();
        f.swim();

        Rabbit r = new Rabbit("小白兔",2);
        System.out.println(r.getName() + ", " + r.getAge());

        r.eat();
    }
}
