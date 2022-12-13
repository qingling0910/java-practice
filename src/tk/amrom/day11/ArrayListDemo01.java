package tk.amrom.day11;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        /*
        添加 boolean add(E e)
        删除 boolean remove(E e)
        修改 E set(int index, E e)
        查询 E get(int index)
        获取长度 int size()
         */
        //添加
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        System.out.println(list);

        //删除
//        list.remove("aaa");
//        System.out.println(list);

//        String str = list.remove(0);
//        System.out.println(str);
//        System.out.println(list);

        //修改
//        String str = list.set(0,"ddd");
//        System.out.println(list);

        //查询
        String str1 = list.get(0);
        System.out.println(str1);

        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            System.out.println(str2);

        }


    }

}
