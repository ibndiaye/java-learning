public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Tesla");
        car.setModel("Model X");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("blue");
        System.out.println("make=" + car.getMake());
        System.out.println("color=" + car.getColor());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Tesla");
        targa.setModel("Model X");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.setColor("red");
        targa.describeCar();
    }
}
