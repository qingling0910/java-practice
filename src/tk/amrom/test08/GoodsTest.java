package tk.amrom.test08;

public class GoodsTest {
    public static void main(String[] args) {
        //1、创建数组
        Goods[] arr = new Goods[3];

        //2、创建3个商品对象
        Goods g1 = new Goods("001", "华为手机", 5999.99,100);
        Goods g2 = new Goods("002", "保温杯", 227, 50);
        Goods g3 = new Goods("003","枸杞",12.7,70);

        //3、将商品存储到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4、遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods  goods = arr[i];
            System.out.println(goods.getId() + " " + goods.getName() + " " + goods.getPrice() + " " + goods.getCount());
        }

    }
}
