public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int num3 = 7;
        
        int resultado = sumarNumeros(num1, num2, num3);
        System.out.println("La suma de los números es: " + resultado);
    }
    
    public static int sumarNumeros(int a, int b, int c) {
        return a + b + c;
    }
}