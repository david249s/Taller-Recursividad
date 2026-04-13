
import java.util.Scanner;

public class NumeroPotencia {
    
    public int calcularPotencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * calcularPotencia(base, exponente - 1);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numero base: ");
        int base = sc.nextInt();

        System.out.print("Ingrese exponente: ");
        int exponente = sc.nextInt();

        NumeroPotencia potencia = new NumeroPotencia();
        int resultado = potencia.calcularPotencia(base, exponente);

        System.out.println(base + "^" + exponente + " = " + resultado);
    }
}
