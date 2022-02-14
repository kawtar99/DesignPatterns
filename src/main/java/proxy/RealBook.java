package proxy;

public class RealBook implements Book{

    private final String title;
    private final String author;

    public RealBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getDetails() {
        return getTitle() + " is written by : " + getAuthor();
    }
}
