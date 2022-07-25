public class GenericMain {
    public static void main(String[] args) {
        Display<Integer> displayInteger = new Display<Integer>(15);
        Display<String> displayString = new Display<String>("Rumahorbo");

        System.out.println(displayInteger.getObject());
        System.out.println(displayString.getObject());

        System.out.println(displayInteger.getString("Satu cara menuliskannya", 1));
        System.out.println(displayInteger.getString(1, "cara membacakannya Satu"));
    }
}
