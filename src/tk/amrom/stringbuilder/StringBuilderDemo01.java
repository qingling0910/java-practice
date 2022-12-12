package tk.amrom.stringbuilder;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100000000; i++) {
            s = s + "abc";

        }
        System.out.println(s);
    }
}
