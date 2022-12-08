package tk.amrom.test08;

public class StudentTest02 {
    public static void main(String[] args) {
         /*
    要求3：通过id删除学生信息
            如果存在，则删除；如果不存在，则提示删除失败
        要求4：删除完毕之后，遍历所有学生信息
     */
        //1、创建一个长度为3的数组
        Student[] arr = new Student[3];

        //2、创建学生对象
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 23);
        Student stu3 = new Student(3, "wangwu", 23);

        //3、将学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求3：通过id删除学生信息
        //如果存在，则删除；如果不存在，则提示删除失败
        int index = getIndex(arr,2);
        if(index > 0){
            //如果存在，则删除
            arr[index] = null;
          //要求4：删除完毕之后，遍历所有学生信息
            printArr(arr);
        }else{
            System.out.println("当前id不存在，删除失败");
        }



    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + " " + stu.getName() + "" + stu.getAge());
            }
        }

    }

    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //对stu做个非空判断
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return  i;
                }

            }
        }
        //当循环结束时，如果还没找到就表示不存在
        return -1;

    }
}
