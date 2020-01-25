package Basic8FilesAndStreams;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class BookStoreTest {

    private static final int NUMBER_OF_BOOKS_AFTER_INITIALIZATION = 36;
    private static final int NUMBER_OF_SAPKOWSKI_BOOKS = 8;
    private static final int NUMBER_OF_BOOKS_FROM_YEAR = 3;
    private static final int NUMBER_OF_BOOKS_WITH_384_PAGES = 2;
    private static final int NUMBER_OF_BOOKS_WITH_29_99_PRICE = 5;
    private static final int NUMBER_OF_BOOKS_FOR_CHILDREN = 6;
    private static BookStore bookStore;

    @BeforeClass
    public static void setUpClass() {
        bookStore = new BookStore();
    }

    @Test
    public void testBookStoreInitializ() {
        Assert.assertEquals(NUMBER_OF_BOOKS_AFTER_INITIALIZATION, bookStore.getBooks().size());
    }

    @Test
    public void testFindBooksByTitle() {
        //given
        Book longLostBook = Book.builder()
                .title("Long Lost")
                .author("Harlan Coben")
                .yearPushlished(2009)
                .numberOfPages(195)
                .price(44.99)
                .genre(Genre.CRIME_STORY)
                .build();
        //when
        List<Book> booksByTitle = bookStore.findBooksByTitle("Long Lost");
        //then
        Assert.assertEquals(1, booksByTitle.size());
        Assert.assertEquals(longLostBook, booksByTitle.get(0));
    }

    @Test
    public void testFindBooksByAuthor() {
        //given
        final String andrzej_sapkowski = "Andrzej Sapkowski";
        //when
        List<Book> sapkowskiBokks = bookStore.findBooksByAuthor(andrzej_sapkowski);
        //then
        Assert.assertEquals(NUMBER_OF_SAPKOWSKI_BOOKS, sapkowskiBokks.size());
        Assert.assertTrue(sapkowskiBokks.stream()
                .allMatch(book -> book.getAuthor().equals(andrzej_sapkowski)));
    }

    @Test
    public void testFindBooksByYear() {
        //given
        int year = 1999;
        //when
        List<Book> booksByYear = bookStore.findBooksByYear(year);
        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_FROM_YEAR, booksByYear.size());
        Assert.assertTrue(booksByYear.stream()
                .allMatch(book -> book.getYearPushlished() == year));

    }

    @Test
    public void testfindBooksByNumberOfPages() {
        //given
        int numberOfPages = 384;
        //when
        List<Book> booksNumberOfPAges = bookStore.findBooksByNumberOfPages(numberOfPages);
        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_WITH_384_PAGES, booksNumberOfPAges.size());
        Assert.assertTrue(booksNumberOfPAges.stream()
                .allMatch(book -> book.getNumberOfPages() == numberOfPages));
    }

    @Test
    public void testfindBooksByPrice() {
        //given
        double price = 29.99;
        //when
        List<Book> booksByPrice = bookStore.findBooksByPrice(price);
        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_WITH_29_99_PRICE, booksByPrice.size());
        Assert.assertTrue(booksByPrice.stream()
                .allMatch(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(price))));
    }

    @Test
    public void testfindBooksByGenre() {
        //given
        Genre genre = Genre.FOR_CHILDREN;
        //when
        List<Book> booksByGenre = bookStore.findBooksByGenre(genre);
        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_FOR_CHILDREN, booksByGenre.size());
        Assert.assertTrue(booksByGenre.stream()
                .allMatch(book -> book.getGenre().equals(genre)));


    }
}
