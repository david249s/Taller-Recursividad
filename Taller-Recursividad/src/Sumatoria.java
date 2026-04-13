
import java.util.Scanner;

public class Sumatoria {
    
    public static double sumatoria(int n){
        if(n==1) return 1;
        return (1.0/n) + sumatoria(n-1);
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Resultado: "+sumatoria(n));
    }
}
