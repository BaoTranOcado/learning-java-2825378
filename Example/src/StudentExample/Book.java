package StudentExample;

public class Book {
    private String title;
    private String author;
    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
    public String getTitle () {
        return title;
    }
    public String getAuthor () {
        return author;
    }

    @Override
    public String toString (){
        return ("Title: "+title+ " from Author: "+author);
    }
}
