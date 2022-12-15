package tk.amrom.day11;

import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) {
        /*
        将test06和test07合并
        既返回索引
        又返回true、false
         */
        //1、创建集合
        ArrayList<User> list = new ArrayList<>();

        //2、创建用户对象
        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "12345qwer");
        User u3 = new User("heima003", "wangwu", "12345678");

        //3、将用户对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4、调用方法判断id是否在集合中
        boolean flag = contains(list, "heima001");

        //5、打印
        System.out.println(flag);

    }
    public static boolean contains(ArrayList<User> list, String id){
        return getIndex(list, id) >= 0;

    }

    public static int getIndex(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u= list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return i;
            }
        }
        return -1;

    }
}
