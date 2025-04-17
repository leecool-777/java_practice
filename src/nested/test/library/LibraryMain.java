package nested.test.library;

public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library(4);

        library.addBook("책1", "저자1");
        library.addBook("책1", "저자1");
        library.addBook("책1", "저자1");
        library.addBook("책1", "저자1");
        library.addBook("책1", "저자1");
        library.showBooks(); //도서관의 모든 정보 출력
    }
}
