package StudentExample;

import java.util.*;

public class Library {
    public static ArrayList<Book> buildLibrary() {
        ArrayList<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Book("Tales of Beedle", "Alice"));
        libraryBooks.add(new Book("Peter Pan", "Arthur"));
        libraryBooks.add(new Book("Celtic", "Roman"));
        libraryBooks.add(new Book("Beedle the Bard", "Three Brothers"));
        libraryBooks.add(new Book("King of the Jungle", "Johnathan"));
        libraryBooks.add(new Book("Dear Darling", "Linda"));
        libraryBooks.add(new Book("Love Actually", "Devin"));
        libraryBooks.add(new Book("Cradle of the North", "Jim"));
        return libraryBooks;
    }
}
