package by.volontirov.wtlab1;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getAuthor().compareTo(o2.getAuthor()) == 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}