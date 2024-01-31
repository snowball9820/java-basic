package extends1.ex;

//Book, Album, Movie 3가지 상품으로 클래스 만들기
//코드 중복 없게 상속관계 사용, 부모 클래스는 Item이라는 이름 사용
//공통 속성 name, price
//Book:저자(author) isbn(isbn)
//Album:아티스트(artist)
//Movie:감독(director),배우(actor)

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합 : "+sum);
    }
}
