public class Calculator {

    double a;
    double b;

    //    phương thức khởi tạo 0 tham số
    public Calculator() {
    }

    //    phương thức khởi tạo 2 tham số
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //    các phương thức get/set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
        public void setB ( double b){
            this.b = b;
        }
//    phương thức tính tổng
    public double add(){
        return a+b;
    }
//    phương thức tính hiệu
    public double sub(){
        return a-b;
    }
//    phương thức tính tích
    public double multi(){
        return a*b;
    }
//    phương thức tính thương
    public double div(){
        return a/b;
    }
}
