package tk.amrom;

public class WhileDemo01 {
    public static void main(String[] args) {
        /*
        练习：打印折纸的次数
        需求：世界上最高山峰是珠穆朗玛峰（8844.43米 = 8844430毫米），假如我有一张足够大的纸，它的厚度是0.1毫米
        请问：我折叠多少次，可以折成珠穆朗玛峰的高度？
         */
        //1、先定一个变量，记录珠穆朗玛的的高度
        double height = 8844430;
        //2、定义变量，记录纸张的初始值
        double paper = 0.1;
        //定义变量，记录折叠次数
        int count = 0;

        while(paper < height ){
            paper = paper * 2;
            count++;
        }
            System.out.println(count);
    }
}
