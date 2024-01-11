package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

        HydrogenCar hydrogenCar=new HydrogenCar();
        hydrogenCar.move();
    } 
}
