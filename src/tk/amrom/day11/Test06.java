package tk.amrom.day11;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        /*
        练习：添加用户对象并判断是否存在
        需求：
        1、main方法中定义一个集合，存入3个用户对象
        用户属性为：id、username、password
        2、要求：定义一个方法，根据id查找对应的用户信息
        如果存在，返回true
        如果不存在，返回false
         */
        //1、创建集合
        ArrayList<User> list = new ArrayList<>();

        //2、创建学生对象
        User u1 = new User("heima001", "zhangsan", "12345");
        User u2 = new User("heima002", "lisi", "123456");
        User u3 = new User("heima003", "wangwu", "12345qwer");

        //3、把学生对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4、判断是否存在
        boolean flag = contains(list,"heima009");

        //5、打印
        System.out.println(flag);


    }
    public static boolean contains(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return true;
            }
        }
        return false;


    }
}
