package tk.amrom.day11;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
       /*
    定义一个集合，添加字符串，并进行遍历
    遍历格式：[元素1, 元素2, 元素3]
     */
     //1、定义集合
        ArrayList<String> list  = new ArrayList<>();

        //2、添加元素
        list.add("元素1");
        list.add("元素2");
        list.add("元素3");

        //3、遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ", ");
            }

        }
        System.out.println("]");
    }

}
