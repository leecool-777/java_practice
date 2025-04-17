package nested.test.library;

public class Library {
    Book[] books;

    public Library(int size) {

    }

    private class Book {
        private String bookName;
        private String authorName;

        public Book(String bookName, String authorName) {
            this.bookName = bookName;
            this.authorName = authorName;
        }
    }

    public void addBook(String book, String author) {
    }

    public void showBooks() {

    }
}
