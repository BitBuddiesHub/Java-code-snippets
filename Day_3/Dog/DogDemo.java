package Day_3.Dog;

class Dog{
    public int weight;
    public int height;
    public int age;
    public boolean is_married;

    public Dog(){
        this.weight = 0;
        this.height = 0;
    }

    public Dog(int weight, int height){
        this.weight = weight;
        this.height = height;
    }

    /*
    public Dog(int weight, int age){
        this.weight = weight;
        this.age = age;
    }
    */

    public Dog(int age, boolean is_married){
        this.age = age;
        this.is_married = is_married;
    }

    public void bark(){
        System.out.println("Bark!");
    }

    public static void meow(){
        System.out.println("Meow!");
    }
}

class Monkey{
    public int age;

    public Monkey(int age){
        this.age = age;
    }
}

public class DogDemo {
    public static void main(String[] args) {
        Dog dog_1 = new Dog();
        System.out.println(dog_1.weight);
        System.out.println(dog_1.height);
        Dog dog_2 = new Dog(10, 20);
        System.out.println(dog_2.weight);
        System.out.println(dog_2.height);

        dog_1.bark();
        // bark();
        // meow();

        Monkey monkey_1 = new Monkey(10);
        // monkey_1.meow();
            
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }

        
    }
}


