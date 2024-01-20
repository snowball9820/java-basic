package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        // 검증로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        //정상로직
        items[itemCount]=item;//배열 인덱스가 1씩 증가하면서 item이 저장됨
        itemCount++;

        //이렇게 해도 되는데 위가 더 깔끔함
//        if (itemCount >= items.length) {
//            System.out.println("장바구니가 가득 찼습니다.");
//        } else {
//            items[itemCount]=item;//배열 인덱스가 1씩 증가하면서 item이 저장됨
//            itemCount++;
//        }

    }

    //출력내용
    /*상품명:마늘 합계:4000
    * 상품명:상추 합계:12000
    * 전체 가격 합:16000
    * */
    public void disPlayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) { //itemCount까지만 돌리는 이유는 10개 다 안채워질 수도 있음 1~9개까지만 저장할 수도 있음
            Item item = items[i];
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getTotalPrice());

        }
        System.out.println("전체 가격 합: "+calculateTotalPrice());
    }

    //전체 합을 따로 메서드로 뽑았고 내부에서만 쓰기때문에 private
    private int calculateTotalPrice() {
        int totalPrice=0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
