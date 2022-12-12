package tk.amrom.stringbuilder;

public class StringBuilderDemo04 {
    public static void main(String[] args) {
        //定义对象
        StringBuilder sb = new StringBuilder();

        //添加数据
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        //把StringBuilder转换为String
        String str = sb.toString();
        System.out.println(str);
    }
}
