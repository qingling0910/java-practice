package tk.amrom.test08;

public class StudentTest03 {
    public static void main(String[] args) {
        // 要求5：查询数组id为"heima002"的学生，如果存在，则将他的年龄 + 1岁
        //1、定义一个长度为3的数组
        Student[] arr = new Student[3];

        //2、创建学生对象
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        //3、将学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //4、找到id为2的学生对象对应的索引
        int index = getIndex(arr,2);

        //5、判断索引
        if(index >= 0){
            //存在，则将他的年龄 + 1岁
            Student stu = arr[index];
            //把原来的年龄取出来 + 1
            int newAge = stu.getAge() + 1;
            //再把 + 1后的年龄塞回去
            stu.setAge(newAge);

            //遍历数组
            printArr(arr);


        }else{
            //不存在，提示修改失败
            System.out.println("当前id不存在，修改失败");

        }
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
    }
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;

                }
            }
        }
        return -1;
    }

}
