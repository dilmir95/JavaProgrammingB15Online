package day47;

public class Triange extends Shape {

    double height;
    double base;

    public Triange(String name, double height, double base){
        super(name);
        this.base = base;
        this.height = height;

    }
    @Override
    public double calculateArea(){
        this.area = (height*base)/2;
        return  area;
    }

    @Override
    public String toString() {
        return "Triange{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
