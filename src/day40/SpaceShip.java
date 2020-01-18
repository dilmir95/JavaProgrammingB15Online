package day40;

public class SpaceShip {

    String name;
    int xCordinate;
    int yCordinate;
    String currentDirection;


    public void move1Block() {
        if (currentDirection.equals("up")) {
            ++yCordinate;
        } else if (currentDirection.equals("down")) {
            --yCordinate;
        } else if (currentDirection.equals("right")) {
            ++xCordinate;
        } else if (currentDirection.equals("left")) {
            --xCordinate;
        }
    }

    public void setDirection(String direction) {
        currentDirection = direction;
    }

    public void setInitialPosition(int x, int y) {
        xCordinate = x;
        yCordinate = y;

    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
    public void move1Block(String direction) {
        setDirection(direction);

        if (currentDirection.equals("up")) {
            ++yCordinate;
        } else if (currentDirection.equals("down")) {
            --yCordinate;
        } else if (currentDirection.equals("right")) {
            ++xCordinate;
        } else if (currentDirection.equals("left")) {
            --xCordinate;
        }
    }

}
