package tk.amrom.a04polymorphismdemo04;

public class Person {
//    3.定义Person类//饲养员
//    属性：
//    姓名，年龄
//    行为：
//    keepPet(Dog dog,String something)方法
//    功能：喂养宠物狗，something表示喂养的东西
//    行为：
//    keepPet(Cat cat,String something)方法
//    功能：喂养宠物猫，something表示喂养的东西
//    生成空参有参构造，set和get方法
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    /*
    饲养狗
    keepPet(Dog dog,String something)方法
			功能：喂养宠物狗，something表示喂养的东西
     */

//    public void keepPet(Dog dog, String something){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
//        dog.eat(something);
//    }
//
//    /*
//    饲养猫
//    keepPet(Cat cat,String something)方法
//			功能：喂养宠物猫，something表示喂养的东西
//     */
//
//    public void keepPet(Cat cat, String something){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
//        cat.eat(something);
//    }

    //想要一个方法，能接收所有的动物，包括猫，包括狗
    //方法的形参：可以写这些类的父类 Animal

    public void keepPet(Animal a, String something){
        if(a instanceof Dog d){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
            d.eat(something);
        }else if(a instanceof Cat c){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + c.getColor() + "颜色的" +  c.getAge() + "岁的猫");
            c.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }

}
