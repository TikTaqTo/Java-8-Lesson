package BookStore;

import BookStore.Models.Book;
import BookStore.Models.Library;
import BookStore.Models.LiteratureBook;
import BookStore.Models.ScientificBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ScientificBook bookS0 = new ScientificBook("Moi", "30", 500, 5000, "Tolka");
        ScientificBook bookS1 = new ScientificBook("Toi", "30", 500, 5000, "Tolka");
        ScientificBook bookS2 = new ScientificBook("Koi", "30", 500, 5000, "Tolka");
        ScientificBook bookS3 = new ScientificBook("Shoi", "30", 500, 5000, "Tolka");
        ScientificBook bookS4 = new ScientificBook("Zloi", "66", 78, 30000, "TMola");

        LiteratureBook bookL0 = new LiteratureBook("Abo", "20", 300, "Santon", 2019);
        LiteratureBook bookL1 = new LiteratureBook("Abo", "20", 300, "Santon", 2019);
        LiteratureBook bookL2 = new LiteratureBook("Abo", "20", 300, "Santon", 2019);
        LiteratureBook bookL3 = new LiteratureBook("Abo", "20", 300, "Santon", 2019);
        LiteratureBook bookL4 = new LiteratureBook("Abo", "20", 300, "Santon", 2019);

        List<Book> allBooks = new ArrayList<>();

        allBooks.add(bookS0);
        allBooks.add(bookS1);
        allBooks.add(bookS2);
        allBooks.add(bookS3);
        allBooks.add(bookS4);
        allBooks.add(bookL0);
        allBooks.add(bookL1);
        allBooks.add(bookL2);
        allBooks.add(bookL3);
        allBooks.add(bookL4);


        Library library = new Library("Nito", "Kito", "Shito", allBooks);

        library.printLibraryData();
    }
}
