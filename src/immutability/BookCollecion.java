package immutability;

import java.util.ArrayList;
import java.util.List;

public class BookCollecion implements BookCollectionInterface {

    private List<Book> booksCollection = new ArrayList<>();

    @Override
    public boolean findBookByTitle(String title) {
        if (booksCollection.isEmpty()) {
            System.out.println("Book's collection empty");
            return false;
        }
        for (Book b : booksCollection) {
            if (b.getTitle().equals(title)) {
                System.out.println("Found " + title + " with id: " + b.getId());
                return true;
            }
        }
        System.out.println("Book not found");
        return false;
    }

    @Override
    public void printAllBooks() {
        if (booksCollection.isEmpty()) {
            System.out.println("Book collections empty");
            return;
        }
        for (Book b : booksCollection) {
            System.out.println(b.toString());
        }
    }

    @Override
    public void add(Book b) {
        booksCollection.add(b);

    }
}

