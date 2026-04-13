
import java.util.Scanner;

public class MultiplicacionSumasSucesivas {

    public static int multiplicacion(int num1, int num2){
        if(num2==0) return 0;
        return num1 + multiplicacion(num1, num2-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("El resultado es: "+multiplicacion(numero1, numero2));
    }
}
