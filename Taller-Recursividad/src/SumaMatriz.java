
import java.util.Scanner;

public class SumaMatriz {
    
    public static int suma(int[][] matriz, int i, int j){
        if(i==matriz.length) return 0;
        if(j==matriz[0].length) return suma(matriz, i+1, 0);
        return matriz[i][j] + suma(matriz, i, j+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese las columnas: ");
        int columnas = sc.nextInt();

        int[][] mat = new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.print("La suma es: "+suma(mat, 0, 0));
    }
}
