public class Rectangle {
    double width,height;

    public Rectangle(){
    }

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimater(){
        return (this.width+this.height)*2;
    }

    public String display(){
        return "Retangle{"+"width="+width+",height+"+height+"}";
    }
}
