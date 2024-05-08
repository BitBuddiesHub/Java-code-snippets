package Day_5.Interfaces;

public class Car implements Vehicle {
    @Override
    public void start() {  // 修正大小写
        System.out.println("Car starts.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops.");
    }
}
