package anotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationMain {

    public static void main(String[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Car car = new Car("Agya");

        if (car.getClass().isAnnotationPresent(Important.class)) {
            System.out.println("this class have important annot");
        } else {
            System.out.println("this class dont have important annot");
        }

        Motorcycle honda = new Motorcycle("Honda");
        if (honda.getClass().isAnnotationPresent(Important.class)) {
            System.out.println("this class have important annot");
        } else {
            System.out.println("this class dont have important annot");
        }

        for (Method method : car.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);
                for (int i = 0; i < importantMethod.times(); i++) {
                    method.invoke(car);
                }
            }
        }

        for (Field field : car.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object object = field.get(car);
                if (object instanceof String) {
                    System.out.println(object.toString().toUpperCase());
                }
            }
        }
    }
}