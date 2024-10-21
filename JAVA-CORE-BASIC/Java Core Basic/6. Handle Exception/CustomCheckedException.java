// Kế thừa từ Exception để tạo checked exception
public class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
