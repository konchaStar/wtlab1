package by.volontirov.wtlab1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BookSortTest {
    @Test
    public void bookIsbnTest() {
        Book[] books = {new Book("a", "a", 1, 3), new Book("a", "a", 1, 1),
                new Book("a", "a", 1, 2)};
        Arrays.sort(books);
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(i + 1, books[i].getIsbn());
        }
    }

    @Test
    public void titleSortTest() {
        Book[] books = {new Book("b", "a", 1, 1), new Book("a", "a", 1, 1),
                new Book("c", "a", 1, 1)};
        Book[] sortedBooks = {new Book("a", "a", 1, 1), new Book("b", "a", 1, 1),
                new Book("c", "a", 1, 1)};
        Arrays.sort(books, new TitleComparator());
        Assert.assertArrayEquals(books, sortedBooks);
    }
    @Test
    public void authorTitleSortTest() {
        Book[] books = {new Book("a", "b", 1, 1), new Book("a", "a", 1, 1),
                new Book("b", "b", 1, 1)};
        Book[] sortedBooks = {new Book("a", "a", 1, 1), new Book("a", "b", 1, 1),
                new Book("b", "b", 1, 1)};
        Arrays.sort(books, new AuthorTitleComparator());
        Assert.assertArrayEquals(books, sortedBooks);
    }
    @Test
    public void authorTitlePriceSortTest() {
        Book[] books = {new Book("a", "b", 2, 1), new Book("a", "a", 1, 1),
                new Book("a", "b", 1, 1)};
        Book[] sortedBooks = {new Book("a", "a", 1, 1), new Book("a", "b", 1, 1),
                new Book("a", "b", 2, 1)};
        Arrays.sort(books, new AuthorTitlePriceComparator());
        Assert.assertArrayEquals(books, sortedBooks);
    }
}
