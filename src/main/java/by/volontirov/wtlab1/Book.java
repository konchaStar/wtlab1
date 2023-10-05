package by.volontirov.wtlab1;

public class Book implements Comparable {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition = 1;

    public Book() {
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + title.hashCode();
        result = (result * PRIME) + author.hashCode();
        result = (result * PRIME) + Integer.hashCode(price);
        result = (result * PRIME) + Integer.hashCode(isbn);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Book book = (Book) obj;
        return this.author.equals(book.author) && this.title.equals(book.title) && this.price == book.price &&
                isbn == book.isbn;
    }

    @Override
    public String toString() {
        return String.format("title: %s; author: %s; price: %d; isbn: %d", this.title, this.author, this.price, this.isbn);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Object o) {
        int result = -((Book) o).isbn + isbn;
        return result > 0 ? 1 : result < 0 ? -1 : 0;
    }
}
