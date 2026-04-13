
import java.util.Scanner;

public class MCD {
    
    public static int mcd(int num1, int num2){
        if(num2==0) return num1;
        return mcd(num2, num1%num2);
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("MCD: "+mcd(numero1, numero2));
    }
}
