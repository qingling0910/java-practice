package tk.amrom.day11;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
        /*
        需求：
        1、main方法中定义一个集合，存入3个用户对象
        用户属性为：id,username，password
        2、要求：
        定义一个方法，根据id查找对应的用户信息
        如果存在，返回索引
        如果不存在，返回-1
         */
        //1、创建集合
        ArrayList<User> list = new ArrayList<>();

        //2、创建用户对象
        User u1 = new User("heima001", "zhangsan", "12345");
        User u2 = new User("heima002", "lisi", "12345qwer");
        User u3 = new User("heima003", "wangwu", "12345678");

        //3、将学生对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4、调用方法查看id是否存在
        int  index = getIndex(list,"heima001");

        //5、输出打印
        System.out.println(index);
    }

    public static int getIndex(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
