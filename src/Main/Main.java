package Main;


public class Main {
    public static void main(String[] args) {
        try {
            Car car = new Car("Запорожец :)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}