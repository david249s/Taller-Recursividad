
import java.util.Scanner;

public class Factorial {
    
    public static int calcularFactorial(int numero) {
        
        if (numero == 0 || numero == 1) return 1;
        return numero * calcularFactorial(numero - 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int numero = sc.nextInt();
        
        System.out.println("El factorial es: " +calcularFactorial(numero));
    }
}
