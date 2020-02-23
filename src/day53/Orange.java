package day53;

public class Orange extends Fruit {

    int vitaminCLevel;

    public Orange(String taste, String color,int vitaminCLevel) {
        super(taste, color);
        this.vitaminCLevel = vitaminCLevel;
    }

    @Override
    public void getDigested() {
        System.out.println("orange with "+vitaminCLevel+" vitamin c level gets digested");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vitaminCLevel=" + vitaminCLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
