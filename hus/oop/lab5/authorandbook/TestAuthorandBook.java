package hus.oop.lab5.authorandbook;

public class TestAuthorandBook {
    public static void main(String[] args) {
        AuthorYourTurn author1 = new AuthorYourTurn("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author1);

        author1.setEmail("ahteck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        BookYourTurn book1 = new BookYourTurn("12345", "Java for dummies", author1, 8.8, 88);
        System.out.println(book1);

        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("author is: " + book1.getAuthor());

        System.out.println("author name: " + book1.getAuthorName());
        System.out.println("author name: " + book1.getAuthor().getName());
        System.out.println("author email: " + book1.getAuthor().getEmail());
    }
}
