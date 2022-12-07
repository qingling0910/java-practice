package tk.amrom.test08;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1、创建数组
        Car[] arr = new Car[3];

        //2、创建汽车对象，
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象
            Car c = new Car();
            //录入汽车品牌
            System.out.println("请录入汽车的品牌：");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("请录入汽车的价格：");
            int price = sc.nextInt();
            c.setPrice(price);

            System.out.println("请录入汽车的颜色：");
            String color =  sc.next();
            c.setColor(color);

            //把汽车对象添加到数组当中
            arr[i] = c;

        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + " " + car.getPrice() + " " + car.getColor());
        }

        }

    }

