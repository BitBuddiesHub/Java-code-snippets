package Day_5.Interfaces;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts.");
    }

    @Override
    public void stop() {  // 修正大小写
        System.out.println("Bike stops.");
    }
}
