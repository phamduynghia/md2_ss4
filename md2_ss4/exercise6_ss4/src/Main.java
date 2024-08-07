public class Main {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        System.out.println("Initial myString value: " + obj.getMyString());

        obj.setMyString("Hello, World!");

        System.out.println("Updated myString value: " + obj.getMyString());
    }
}
