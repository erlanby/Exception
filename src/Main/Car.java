package Main;

public class Car implements AutoCloseable {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public void close() throws Exception {
        System.out.println(carName + " Машина жабылып жатат");
    }
    public void drive(){
        System.out.println(carName + " Машина журуп жатат");
    }
}
