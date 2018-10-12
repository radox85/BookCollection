package immutability;

public class Runner {

    public static void main(String[] args) {

        BookCollecion bookCollecion = new BookCollecion();
        bookCollecion.add(new Book(1, "First book", "Radek", Price.DOLARS, 8.7f));
        bookCollecion.add(new Book(2, "Second book", "Ania", Price.PLN, 1.2f));
        bookCollecion.add(new Book(3, "Third book", "Tomek", Price.DOLARS, 0.1f));
        bookCollecion.add(new Book(4, "Forth book", "Justyna", Price.EURO, 21.7f));

        bookCollecion.printAllBooks();
        bookCollecion.findBookByTitle("Forth book");


    }

}
