package tk.amrom.test08;

public class StudentTest01 {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1～3名学生对象作为初始数据，学生对象的学号、姓名各不相同
        学生的属性：学号、姓名、年龄
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        要求2：添加完毕之后，遍历所有学生信息
        要求3：通过id删除学生信息
            如果存在，则删除；如果不存在，则提示删除失败
        要求4：删除完毕之后，遍历所有学生信息
        要求5：查询数组id为"heima002"的学生，如果存在，则将他的年龄 + 1岁
         */

        //1、创建一个长度为3的数组
        Student[] arr = new Student[3];

        //2、创建学生对象
        Student stu1 = new Student(1,"zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        //3、将学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //4、再次创建一个学生对象
        Student stu4 = new Student(4, "zhaoliu", 26);

        //5、唯一性判断
        //5.1 已存在 ----提示重复
        //5.2 不存在 ----添加到学生数组中
        boolean flag = contains(arr, stu4.getId());
        if(flag){
            //已经存在，不用添加，提示重复
            System.out.println("id重复");
        }else {
            //不存在 ----把stu4添加到数组中
            //1、数组已存满----只能创建一个新的数组，再将老数组的数据拷贝至新数组，新数组的长度= 老数组 + 1
            //2、数组没有存满----直接添加
            int count = getCount(arr);
            if(count == getCount(arr)){
                //已存满
                //创建新的数组
                Student[] newArr = createNewArr(arr);
                //把sut4添加至新数组
                newArr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息
                printArr(newArr);

            }else {
                arr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息
                printArr(arr);
            }
        }


        //6、添加学生对象
        //6.1 老数组已经存满
        //6.2 老数组没有存满
    }
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + " " + stu.getName() + "" + stu.getAge());
            }
        }
    }

    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组的每一个元素
        for (int i = 0; i < arr.length; i++) {
                //再把老数组中的元素添加到新数组中
                newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr){
        //定义一个计数器用来统计数组的元素个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        //当循环结束后，就知道数组中一共有多少个元素；
        return count;
    }


    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            //依次获取数组中的每一个学生元素
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                //比较sid和id
                if(sid == id){
                    return true;
                }
            }

        }
        return false;

        }

    }

