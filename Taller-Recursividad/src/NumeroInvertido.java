
import java.util.Scanner;

public class NumeroInvertido {

    public int invertirNumero(int n, int inv) {
        if (n == 0) return inv;
        return invertirNumero(n / 10, inv*10 + n%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese numero: ");
        int numero = sc.nextInt();
        
        NumeroInvertido inv = new NumeroInvertido();
        int resultado = inv.invertirNumero(numero, 0);
        
        System.out.println("El numero invertido es: " + resultado);
    }
}
