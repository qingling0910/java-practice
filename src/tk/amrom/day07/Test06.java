package tk.amrom.day07;

public class Test06 {
    public static void main(String[] args) {
        /*
        练习：数字加密
        需求：某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        规则如下：
        先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数
         */
        //1、定义数组
        int[] arr = {1,9,8,3};
        //2、每位数加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;

        }
        //3、再对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;

        }
        //4、将所有数字反转
        for (int i = 0,  j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //5、拼接数组中对每个数字
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];

        }
        System.out.println(number);
        }
    }

