
import java.util.Scanner;

public class Fibonacci {
    
    public static int serieFibonacci(int numero){
        if(numero==0) return 0;
        if(numero==1) return 1;
        return serieFibonacci(numero-1)+serieFibonacci(numero-2);
    }

    public static void imprimirLim(int n, int i){
        if(i>n) return;
        System.out.print(serieFibonacci(i)+" ");
        imprimirLim(n, i+1);
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese limite: ");
        int num = sc.nextInt();

        System.out.print("Ingrese la serie: ");
        imprimirLim(num, 0);
    }
}
