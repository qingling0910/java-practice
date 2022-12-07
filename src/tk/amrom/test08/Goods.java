package tk.amrom.test08;

    /*
    需求：
    定义数组存储3个商品对象
    商品的属性：商品的id、名字、价格、库存等
    创建3个商品对象，并把商品对象存入到数组当中
     */
public class Goods {
    private String id;
    private String name;
    private double price;
    private int count;

    public Goods(){

    }

    public Goods(String id, String name, double price, int count){
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;

    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return count;
    }
}
