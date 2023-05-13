package hus.oop.lab5.authorandbook;

public class TestBook {
    public static void main(String[] args) {
        // Exercise 2.1 The Author and Book Classes
        Author author1 = new Author("Tan Ah Teck", "ahteck@somewhere.com");
        Book book1 = new Book("12345", "Java for dummies", author1, 7.9, 79);
        System.out.println(book1);
        book1.setPrice(9.99);
        book1.setQty(29);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("author is: " + book1.getAuthor());
        System.out.println("author's name: " + book1.getAuthorName());
        System.out.println("author's email: " + book1.getAuthor().getEmail());
        // Exercise 2.2 The Author and Book Classes Again
        Author [] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@gmail.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookWrittenByManyAuthor javaDummy = new BookWrittenByManyAuthor("Java for Dummy", authors, 19.79, 79);
        System.out.println(javaDummy);
        System.out.println(javaDummy.getAuthorNames());
    }
}
