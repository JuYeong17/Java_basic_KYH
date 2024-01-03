package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder order1=new ProductOrder();
        order1.prodcutName="음료수";
        order1.price=1000;
        order1.quantity=3;
        ProductOrder order2=new ProductOrder();
        order2.prodcutName="과자";
        order2.price=2000;
        order2.quantity=4;
        ProductOrder[] order= {order1, order2};
        int result=0;

        for(int i=0;i< order.length;i++){
            ProductOrder[] o =order;
            result += o[i].price * o[i].quantity;
        }
        System.out.println(result);
    }
}
