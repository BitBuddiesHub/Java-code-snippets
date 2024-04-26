package Day_3.Dog;

public class Dog {
    private int weight;
    private int height;

    public Dog(){
        this.weight = 0;
        this.height = 0;
    }
    public Dog(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
    public void bark(){
        System.out.println("Bark!");
    }

    public static void meow(){
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Dog dog_1 = new Dog();
        System.out.println(dog_1.weight);
        System.out.println(dog_1.height);
        Dog dog_2 = new Dog(10, 20);
        System.out.println(dog_2.weight);
        System.out.println(dog_2.height);

        dog_1.bark();
        // bark();
        meow();
    }
}