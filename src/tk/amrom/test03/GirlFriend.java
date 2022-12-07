package tk.amrom.test03;

public class GirlFriend {
        /*
        练习：女朋友类
        编写女朋友类，创建女朋友类的对象
        给女朋友的属性赋值并调用女朋友类中的方法
        自己思考，女朋友类中有哪些属性，有哪些行为
         */
        //属性
        private  String name;
        private int age;
        private String gender;

        //针对每一个私有化的成员变量，都要提供set和get方法
        //set方法：给成员变量赋值
        //get方法：对外提供成员变量的值

        //作用：给成员变量赋值
        public void setName(String name){
            this.name = name;
        }

        public String  getName(){
             return name;
        }

        public void setAge(int age){
            if(age >= 18 && age < 50){
                this.age = age;
            }else {
                System.out.println("非法数据");
            }

        }

        public int getAge(){
            return age;
        }

        public void setGender(String gender){
           this.gender = gender;
        }

        public String getGender(){
            return gender;
        }
    //行为
        public void sleep(){
            System.out.println("女朋友在睡觉");
        }

        public void eat(){
            System.out.println("女朋友在吃饭");
        }



    }


