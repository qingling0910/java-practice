package tk.amrom.stringdemo;

public class StringDemo07 {
    public static void main(String[] args) {
        /*
        身份证信息查看
        输出如下：
        人物信息为：
        出生年月日：XXXX年X月X日
        性别为：男/nv
         */
        //1、定义字符串记录身份证信息
        String id = "341225202202022456";

        //截取出生年、月、日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        System.out.println("人物信息为：");
        System.out.println("出生年月日为：" + year + "年" + month + "月" + day + "日");

        //获取性别
        //性别为倒数第二位，奇数为男，偶数为女
         char gender = id.charAt(16);
         int num = gender - 48;
        if(num % 2 == 0){
            System.out.println("性别为：女");

        }else{
            System.out.println("性别为：男");
        }
    }
}
