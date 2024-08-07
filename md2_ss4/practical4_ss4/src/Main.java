import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       khởi tạo máy nhập từ lớp Scanner
        Scanner input= new Scanner(System.in);
//        khởi tạo đối tượng từ lớp Calculator
        Calculator calculator=new Calculator();
//        nhập giá trị cho 2 số a và b;
        System.out.println("Nhập a = ");
        double a=input.nextDouble();
        System.out.println("Nhập b = ");
        double b=input.nextDouble();
//        đặt giá trị cho 2 thuộc tính của đối tượng calculator
        calculator.setA(a);
        calculator.setB(b);
//        hiển thị các kết quả của phép toán
        System.out.println("Tổng 2 số là : "+calculator.add());
        System.out.println("Hiệu 2 số là : "+calculator.sub());
        System.out.println("Tích 2 số là : "+calculator.multi());
        System.out.println("Thương 2 số là : "+calculator.div());
    }
}