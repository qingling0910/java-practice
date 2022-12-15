package tk.amrom.day11;

import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        /*
        练习：添加手机对象并返回要求的数据
        需求：定义Javabean类：phone
        phone属性：品牌、价格
        main方法中定义一个集合，存入3个手机对象
        分别为：小米，1000； 苹果，8000； 锤子，2999
        定义一个方法：将价格低于3000的手机信息返回
         */
        //1、创建集合
        ArrayList<Phone> list = new ArrayList<>();

        //2、创建手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        //3、将手机对象添加到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4、调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        //5、遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getPrice());
        }
    }
    public static ArrayList<Phone>  getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if(price < 3000){
                resultlist.add(p);
            }
        }
        return resultlist;
    }
}
