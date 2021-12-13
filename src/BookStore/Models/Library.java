package BookStore.Models;

import java.util.List;

public class Library {
    private String name;
    private String city;
    private String country;
    private List<Book> books;

    public Library() {
    }

    public Library(String name, String city, String country, List<Book> books) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void printLibraryData() {
        System.out.println("Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", books=" + books +
                '}');

        for (Book book : books) {
            System.out.println(book.getBookData());
        }
    }
}
