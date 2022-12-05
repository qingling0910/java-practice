package tk.amrom.day07;

public class Test07 {
    public static void main(String[] args) {
        /*
        需求：把整数上的每一位都添加到数组当中
        反向推导
         */

        //分析：1、先有个数组，数组的元素、长度都不知道
        int number = 12345;
        int count = 0;
        int temp = number;
        while(number != 0){
            number = number / 10;
            count++;
        }
        //2、定义数组
        int []arr = new int [count];
        //3、把整数上的每一位都添加到数组当中
        int index = arr.length -1;
        while(temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
