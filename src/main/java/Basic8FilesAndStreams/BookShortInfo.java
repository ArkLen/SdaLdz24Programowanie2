package Basic8FilesAndStreams;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
class BookShortInfo {

    private String title;
    private String author;
    private int yearPushlished;
}
