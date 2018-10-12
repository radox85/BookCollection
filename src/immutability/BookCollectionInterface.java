package immutability;

import java.util.List;

public interface BookCollectionInterface {

    boolean findBookByTitle(String title);

    void printAllBooks();

    void add(Book b);

}
