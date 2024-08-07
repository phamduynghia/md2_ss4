public class Main {
    public static void main(String[] args) {
//        tạo các đối tượng từ lớp Person
        Person p1=new Person("John","Carter",22,true);
        Person p2=new Person("May","Leona",19,false);
////        truy cập trực tiếp các thuộc tính của đối tượng
//        System.out.println(p1.firstName);//không thể truy cập trực tiếp thuộc tính private
////        truy cập gián tiếp qua phương thức getter/setter
        System.out.println(p1.getFirstName());//"John"
        System.out.println("Name p2 : "+p2.getFirstName()+" "+p2.getLastName());//May Leona
    }
}