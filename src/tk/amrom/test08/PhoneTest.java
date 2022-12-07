package tk.amrom.test08;

public class PhoneTest {
    public static void main(String[] args) {
        /*
        定义数组存储3部手机对象
        手机的属性：品牌、价格、颜色
        要求，计算出3部手机的平均价格
         */
        //1、定义数组
        Phone[] arr = new Phone[3];

        //2、创建手机对象
        Phone p1 = new Phone("小米", 3999, "金色");
        Phone p2 = new Phone("华为", 5999, "紫色");
        Phone p3 = new Phone("苹果", 8999,"银灰色");

        //3、把手机对象添加到数组
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4、获取3部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }

        //5、求平均值
        int avg = sum / arr.length;
        System.out.println(avg);

    }
}
