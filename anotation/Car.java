package anotation;

@Important
public class Car {

    @ImportantString
    String name;

    Car(String name) {
        this.name = name;
    }

    @ImportantMethod(times = 3)
    String getName() {
        System.out.println(this.name);
        return this.name;
    }

    String getAll() {
        System.out.println("empty string");
        return "";
    }
}
