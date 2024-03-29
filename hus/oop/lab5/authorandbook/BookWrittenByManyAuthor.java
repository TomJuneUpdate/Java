package hus.oop.lab5.authorandbook;

public class BookWrittenByManyAuthor {
    private String name;
    private Author [] authors;
    private double price;
    private int qty = 0;
    public BookWrittenByManyAuthor(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public BookWrittenByManyAuthor(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String info = "Book[name = " + name + ", authors = {";
        for (int i = 0; i < authors.length; i++) {
            if (i != authors.length - 1) {
                info += authors[i].toString() + ", ";
            } else {
                info += authors[i].toString();
            }
        }
        return info + "}, price = " + price + ", qty = " + qty + "]";
    }

    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length; i++) {
            if (i != authors.length - 1) {
                authorNames += authors[i].getName() + ", ";
            } else {
                authorNames += authors[i].getName();
            }
        }
        return authorNames;
    }
}
