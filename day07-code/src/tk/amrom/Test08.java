package tk.amrom;

public class Test08 {
    public static void main(String[] args) {
        /*
         练习：数字解密
        需求：某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        规则如下：
        每位数加上5，
        再对10求余，
        最后将所有数字反转，
        得到一串新数
        按照以上规则进行解密；
        比如1983加密之后变成8346，解密之后变成1983
         */
        //分析：1、先定义加密后的数组
        int []arr = {8,3,4,6};
        // 2、将数字反转
        for (int i = 0, j = arr.length -1 ;i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        //3、由于加密是对10取余的方式获取的
        //所以解密的时候，就需要判断，0～4之间+ 10，5～9之间不变
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;

            }
        }

        //4、再对每位数 -5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        //5、拼接数组的每个元素
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }


}
