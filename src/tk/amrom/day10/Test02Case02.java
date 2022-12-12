package tk.amrom.day10;

public class Test02Case02 {
    public static void main(String[] args) {
        /*
        练习：调整字符串
        给定两个字符串，A和B
        A的旋转操作就是将A最左边的字符移动到最右边
        例如，若A = 'abcde' ,在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回true；
        如果不能匹配成功，则返回false
         */
        //1、定义字符串
        String strA = "abcde";
        String strB = "bcdea";

        //2、比较字符串
        boolean result = check(strA, strB);

        //3、输出
        System.out.println(result);
    }
    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
//            System.out.println("旋转前：" + strA);
            strA = rotate(strA);
//            System.out.println("旋转后：" + strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;

    }

    //可以把字符串先变成一个字符数组，然后调整字符串数组里的数据，最后再把字符数组变成字符串
    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        //拿到0索引上的字符
        char first = arr[0];
        //把剩余的字符往前挪一位

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        //把原来0索引上的字符方法移到最右侧
        arr[arr.length - 1] = first;

        //；利用字符数组创建一个字符串对象
        String result = new String(arr);
        return result;
    }
}
