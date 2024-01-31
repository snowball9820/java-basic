package extends1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
    //오버라이드도 필요 ctrl+o로 오버라이드 자동 완성
    @Override
    public void print() {
        super.print();
        System.out.println("-저자: " + author + ", isbn: " + isbn);//저자: han, isbn: 12345
    }


}
