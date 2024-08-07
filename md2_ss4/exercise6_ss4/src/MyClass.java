public class MyClass {

    private String myString;

    public MyClass() {
        this.myString = ""; // Khởi tạo giá trị mặc định
    }

    public MyClass(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
}
