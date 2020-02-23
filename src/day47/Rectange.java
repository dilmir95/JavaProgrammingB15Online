package day47;

import day44.sub.Refrigerator;

public class Rectange extends Shape {

    double width;
    double height;

    public Rectange(String name, double width, double height){
        super(name);
        this.width = width;
        this.height= height;

    }

    @Override
    public String toString() {
        return "Rectange{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
    @Override
    public double calculateArea(){
        area = width*height;
        return area;
    }
}
