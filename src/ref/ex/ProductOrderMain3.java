package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        //scanner로 주문 개수 입력 받음
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요. : ");
        int n = scanner.nextInt(); //이것만 쓰면 버그 발생
        scanner.nextLine();//입력 버퍼를 비우기 위한 코드


        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명 : ");
            String productName = scanner.nextLine();

            System.out.println("가격 : ");
            int price = scanner.nextInt();

            System.out.println("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();//입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);

        }


        printOrders(orders);
        int totalAmount = getTotalAmount(orders); //ctrl+alt+v > int totalAmount를 추측해서 자동 생성 단축키

        System.out.println("총 결제 금액 : " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;

    }


    //출력만 하기 때문에 반환 필요X
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);

        }
    }

    //totalAmount 메서드
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
