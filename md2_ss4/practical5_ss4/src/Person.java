public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean gender;

    public Person(){
    }
    public Person(String firstName,String lastName,int age,boolean gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
    }
    public String getFirstName(){
        return  firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public boolean isGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender=gender;
    }



    public static void main(String[] args) {
//        tạo các đối tượng từ lớp Person
        Person p1=new Person("John","Carter",22,true);
        Person p2=new Person("May","Leona",19,false);
//        truy cập trực tiếp các thuộc tính của đối tượng
        System.out.println(p1.firstName);//không thể truy cập trực tiếp thuộc tính private
//        truy cập gián tiếp qua phương thức getter/setter
        System.out.println(p1.getFirstName());//"John"
        System.out.println("Name p2 : "+p2.getFirstName()+" "+p2.getLastName());//May Leona
    }
}
