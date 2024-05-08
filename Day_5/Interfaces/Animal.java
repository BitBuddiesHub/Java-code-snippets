package Day_5.Interfaces;

public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats.");
    }

    public void barc() {  // 这里可能是一个打字错误，意图是重写 `bark` 方法
        System.out.println("Dog barks.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }

    @Override
    public void bark() {  // 这将引起编译错误，除非超类中有这个方法
        System.out.println("Dog barks.");
    }
}
