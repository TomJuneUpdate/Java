package hus.oop.lab5.authorandbook;

public class AuthorYourTurn {
    // Exercise 2.3 The Author and Book Classes - Your Turn
    private String name;
    private String email;
    public AuthorYourTurn(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "AuthorYourTurn[name = " + name + ", email = " + email + "]";
    }


}