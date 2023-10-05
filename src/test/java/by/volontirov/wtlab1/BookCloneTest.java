package by.volontirov.wtlab1;

import org.junit.Assert;
import org.junit.Test;

public class BookCloneTest {
    @Test
    public void bookCloneTest() throws CloneNotSupportedException {
        Book book = new Book("Clockwork orange", "deb", 1000, 1);
        Book book2 = (Book) book.clone();
        Assert.assertEquals(book2, book);
    }
}
