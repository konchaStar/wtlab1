package by.volontirov.wtlab1;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + Integer.hashCode(level);
        result = (result * PRIME) + language.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if(!obj.getClass().equals(getClass())) {
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) obj;
        return super.equals(book) && book.language.equals(this.language) && book.level == this.level;
    }

    @Override
    public String toString() {
        return String.format("ProgrammerBook: [language: %s, level: %d, author: %s, title: %s, price: %d]",
                language, level, getAuthor(), getTitle(), getPrice());
    }
}
