package Calculator;

public class Main {
    public static void main(String[] args) {
        calculator calc = new calculator();
        
      
        int sum = calc.add(10, 5);
        System.out.println("10 + 5 = " + sum);
       
        int difference = calc.subtract(10, 5);
        System.out.println("10 - 5 = " + difference);
        
       
        System.out.println("\nMore examples:");
        System.out.println("25 + 15 = " + calc.add(25, 15));
        System.out.println("100 - 37 = " + calc.subtract(100, 37));
        System.out.println("0 + 0 = " + calc.add(0, 0));
        System.out.println("50 - 50 = " + calc.subtract(50, 50));
    }
}
