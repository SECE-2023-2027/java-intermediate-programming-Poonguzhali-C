package Problem5;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car();
        vehicles[1] = new MotorVehicle();

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].startEngine());
        }
    }
}
