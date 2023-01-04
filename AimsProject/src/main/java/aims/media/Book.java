package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<>();

    public Book() {
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super(title, category, cost);
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", title=" + getId() +
                ", category=" + getCategory() +
                ", authors=" + authors +
                ", cost=" + getCost() + '$' +
                '}';
    }
}
