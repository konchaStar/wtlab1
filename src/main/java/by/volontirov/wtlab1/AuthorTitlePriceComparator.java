package by.volontirov.wtlab1;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getAuthor().compareTo(o2.getAuthor()) == 0) {
            if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
