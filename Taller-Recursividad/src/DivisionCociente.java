
import java.util.Scanner;

public class DivisionCociente {
    
    public static int divisionCociente(int num1, int num2){
        if(num1<num2) return 0;
        return 1 + divisionCociente(num1-num2, num2);
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("El resultado es: "+divisionCociente(numero1, numero2));
    }
}
