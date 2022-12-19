package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book() {
    }

    public Book(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        if (this.authors.contains(authorName)){
            System.out.println("Cannot add book of the author" + authorName);
        }else {
            this.authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName){
        if (!this.authors.contains(authorName)){
            System.out.println("Cannot remove book of the author" + authorName);
        }else {
            this.authors.remove(authorName);
        }
    }
}
