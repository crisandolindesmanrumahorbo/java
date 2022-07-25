
public class Display<T> {
    T object;

    Display(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }

    <K, L> String getString(K firstParam, L secondParam) {
        return firstParam.toString() + " " + secondParam.toString();
    }
}