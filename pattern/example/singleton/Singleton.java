package pattern.example.singleton;

public class Singleton {
    private static Singleton instance;

    // Private constructor để ngăn việc tạo thể hiện từ bên ngoài lớp
    private Singleton() {
        // Các khởi tạo ban đầu (nếu cần)
    }

    // Phương thức public để truy cập vào thể hiện duy nhất của lớp
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Các phương thức khác của Singleton...
}

