package tk.amrom.test08;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*
        定义数组存储4个女朋友的对象
        女朋友的属性：姓名、年龄、性别、爱好
        要求1：计算出4个女朋友的平均年龄
        要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来
         */
        //1、定义数组存储女朋友
        GirlFriend[] arr = new GirlFriend[4];

        //2、创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子", "吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子", "打游戏");
        GirlFriend gf3 = new GirlFriend("小慧慧", 20, "萌妹子", "看书，学习");
        GirlFriend gf4 = new GirlFriend("小丽丽", 21, "憨妹子", "睡觉");

        //3、将女朋友对象添加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4、求和（女朋友年龄）
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }

        //5、求平均值
        int avg = sum / arr.length;

        //6、统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < avg){
                count++;
                System.out.println(gf.getName() + " " + gf.getAge() + " " + gf.getGender() + " " + gf.getHobby());
            }

        }
        System.out.println("年龄比平均值低的的有" + count + "个");
    }
}
