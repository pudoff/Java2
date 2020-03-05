package GeekBrains.Lesson2.HW;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException() {
        super();
    }
    public MyArrayDataException(String message) {
        super(message);
    }

    public String getMessage() {
        return ("Массив содержит строковые данные, которые невозможно перобразовать в число");
    }
}
