package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("주문할 개수를 적으시오: ");
        int n=sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for(int i=0;i< orders.length;i++){
            System.out.print((i+1)+"번째 주문 정보를 입력하시오");

            System.out.print("상품명: ");
            String productName=sc.nextLine();

            System.out.print("가격: ");
            int price=sc.nextInt();

            System.out.print("수량: ");
            int quantity=sc.nextInt();

            orders[i]=createOrder(productName,price,quantity);
        }

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
