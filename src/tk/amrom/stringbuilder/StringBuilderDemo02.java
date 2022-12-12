package tk.amrom.stringbuilder;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100000000; i++){
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
