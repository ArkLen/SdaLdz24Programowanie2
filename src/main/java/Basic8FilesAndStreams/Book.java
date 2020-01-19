package Basic8FilesAndStreams;

public class Book {

    private String title;
    private String author;
    private int yearPushlished;
    private int numbersOfPages;
    private double price;
    Genre genre;

    public Book(String title, String author, int yearPushlished, int numbersOfPages, double price, Genre genre) {
        this.title = title;
        this.author = author;
        this.yearPushlished = yearPushlished;
        this.numbersOfPages = numbersOfPages;
        this.price = price;
        this.genre = genre;
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

    public int getYearPushlished() {
        return yearPushlished;
    }

    public void setYearPushlished(int yearPushlished) {
        this.yearPushlished = yearPushlished;
    }

    public int getNumbersOfPages() {
        return numbersOfPages;
    }

    public void setNumbersOfPages(int numbersOfPages) {
        this.numbersOfPages = numbersOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPushlished=" + yearPushlished +
                ", numbersOfPages=" + numbersOfPages +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }
}
