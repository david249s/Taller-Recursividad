
import java.util.Scanner;

public class Sumatoria2 {
    
    public static int sumatoria(int n){
        if(n==0) return 0;
        return n + sumatoria(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Resultado: "+sumatoria(n));
    }
}
