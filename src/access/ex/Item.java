package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;

    }

    public int getTotalPrice() {
        return price * quantity;
    }//여기서 미리 계산 안하고 price랑 quantity따로 메서드를 만들어서 추후에 게산해도 됨
}
