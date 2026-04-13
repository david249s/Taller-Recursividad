
import java.util.Scanner;

public class Ackermann {
    
    public static int funcionAckermann(int m, int n){
        if(m==0) return n+1;
        if(n==0) return funcionAckermann(m-1,1);
        return funcionAckermann(m-1, funcionAckermann(m,n-1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("El resultado es: "+funcionAckermann(m, n));
    }
}
