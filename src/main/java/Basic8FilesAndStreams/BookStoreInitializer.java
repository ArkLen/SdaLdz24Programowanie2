package Basic8FilesAndStreams;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookStoreInitializer {

    List<Book> bookList = new ArrayList<>();
    String booksFilePath = getClass().getClassLoader().getResource("books.txt").getFile();
    File booksFile = new File(booksFilePath);


}
