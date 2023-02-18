
class Library2 {
    String[] books;
    int no_of_books;

    Library2(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[this.no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String book: books) {
            if(book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for(int i=0; i<this.books.length; i++) {
            if(this.books[i].equals(book)) {
                System.out.println(book + " book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book don't exist");
    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class cwh_61_ex4sol {
    public static void main(String[] args) {
        // You have to implement a library using Java Class Library
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store available books, Array to store issued books

        Library2 centralLibrary = new Library2();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
