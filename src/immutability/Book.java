package immutability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private int id;
    private final String title;
    private final String author;
    private Price currency;
    private float price;

    public Book(int id, String title, String author, Price currency, float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.currency = currency;
        this.price = price;
    }

    public Price getCurrency() {
        return currency;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return (id + "." + title + ',' + author + ',' + price + currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
