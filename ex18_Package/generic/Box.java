package ex18_Package.generic;

public class Box<T> {
    private T value;

    // Getter สำหรับ 'value'
    public T getValue() {
        return value;
    }

    // Setter สำหรับ 'value'
    public void setValue(T value) {
        this.value = value;
    }
}
