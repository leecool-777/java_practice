package nested.test.library;

public class Library {
    Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        //검증 로직을 다 처리하고
        if (bookCount >= books.length) {
            System.out.println("도서 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직 처리
            books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title =  title;
            this.author = author;
        }
    }
}
