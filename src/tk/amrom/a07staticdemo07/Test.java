package tk.amrom.a07staticdemo07;



public class Test {
    public static void main(String[] args) {
//        Student s = new Student();
        OverseasStudent s = new OverseasStudent();
        s.lunch();

    }
}

class Person{
    public void eat(){
        System.out.println("吃米饭、吃菜");
    }

    public void drink(){
        System.out.println("喝开水");
    }
}

class OverseasStudent extends Person{
    public void lunch(){
        this.eat();//吃意大利面
        this.drink();//喝凉水

        super.eat();// 吃米饭、吃菜
        super.drink();//喝开水
    }

    //应用场景：当父类中的方法无法满足子类现在的需求时，我们就需要把这个方法进行重写
    //注意：子类中重写的方法上面需要加上@overwrite
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}

class Student extends Person{
    public void lunch(){
        eat();
        drink();
    }
}
