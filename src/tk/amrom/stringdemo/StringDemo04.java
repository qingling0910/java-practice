package tk.amrom.stringdemo;

public class StringDemo04 {
    public static void main(String[] args) {
        /*
        字符串反转
        定义一个方法，实现字符串反转
        键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入abc，输出结果cba
         */
        //调用方法
        String result = reverse("abc");
        System.out.println(result);
    }
    //分析：1、我要干什么        ----实现字符串反转
    //2、做这件事，需要什么      -----字符串
    //3、方法调用处是否需要返回   -----需要

    public static String reverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;

    }
}
