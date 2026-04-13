
import java.util.Scanner;

public class SumaArreglos {
    
    public static int suma(int[] vector, int numero){
        if(numero==0) return 0;
        return vector[numero-1] + suma(vector, numero-1);
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad: ");
        int num = sc.nextInt();

        int[] arreglo = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Valor "+i+": ");
            arreglo[i]=sc.nextInt();
        }

        System.out.print("La suma es: "+suma(arreglo, num));
    }
}
