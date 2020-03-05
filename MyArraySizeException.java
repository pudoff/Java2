package GeekBrains.Lesson2.HW;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super();
    }
    public MyArraySizeException(String message) {
        super(message);
    }

    public String getMessage() {
        return ("Размер входящего массива больше разрешенного");
    }
}
