package tk.amrom.stringbuilder;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        //定义对象
        StringBuilder sb = new StringBuilder("abc");

        //添加数据
//        sb.append("aaa");
//        sb.append("bbb");
//        sb.append("ccc");
//        sb.append("ddd");

        //反转
        sb.reverse();

        //返回长度
        int len = sb.length();

        System.out.println(sb);
        System.out.println(len);

    }

}
