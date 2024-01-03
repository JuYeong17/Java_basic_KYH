package ref.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("음료수", 1000, 3);
        orders[1] = createOrder("과자", 2000, 5);
        orders[2] = createOrder("물", 500, 2);

        printOrders(orders);
        int totalAmount=getTotalAmount(orders);
        System.out.println("총 금액:"+totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order=new ProductOrder();
        order.productName= productName;
        order.price=price;
        order.quantity=quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for(ProductOrder o: orders) {
            System.out.println("상품명: " + o.productName +"가격 :"+o.price+"수량:"+o.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int result = 0;
        for(ProductOrder o:orders) {
            result += o.price * o.quantity;
        }
        return result;
    }
}
