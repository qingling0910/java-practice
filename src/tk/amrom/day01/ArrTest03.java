package tk.amrom.day01;

public class ArrTest03 {
    public static void main(String[] args) {
        /*
        练习：变化数据
        定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素
        要求：
        1、如果是奇数，则将当前数字扩大两倍
        2、如果是偶数，则将当前数字变成二分之一
         */
        //1、定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2、遍历数组，得到每一个元素
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            if(arr[i] % 2 == 0){
                arr[i] =arr[i] / 2;
            }else{
                arr[i] = arr[i] * 2;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        }

        //3、判断是奇数还是偶数
        //奇数：扩大两倍
        //偶数：变成二分之一
    }
