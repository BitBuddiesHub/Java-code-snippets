package Day_3.Calculator;

public class Calculator {
    
    final int A = 10;
    public int multiply(int a, int b){
        return a*b;
    }

    public int add(int a, int b){
        return a+b;
    }

    

    public static void main(String[] args){
        Calculator calc = new Calculator();
        int result = calc.multiply(10, 20);
        System.out.println(result);
    }
}

