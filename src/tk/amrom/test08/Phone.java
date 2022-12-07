package tk.amrom.test08;

public class Phone {
    /*
    需求：
    定义数组存储3部手机对象
    手机的属性：品牌、价格、颜色
    要求，计算出三部手机的平均价格
     */

    //属性
    private String brand;
    private int price;
    private String color;

    //空参构造
    public Phone(){

    }

    //全参构造
    public Phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;

    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
