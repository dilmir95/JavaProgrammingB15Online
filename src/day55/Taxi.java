package day55;

public class Taxi {

    int plateNumber;
    Engine eng;
    Driver drv;

    public Taxi(int plateNumber, Engine eng,Driver drv) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.drv = drv;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                ", driver=" + drv +
                '}';
    }
}

class Engine{
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

}
class Driver{
    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}
