
import java.util.Scanner;


public class Cadena {
    
    public static String copiarCadena(String s){
        if(s.isEmpty()) return "";
        return s.charAt(0) + copiarCadena(s.substring(1));
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese texto: ");
        String s = sc.nextLine();

        System.out.print("Copia: "+copiarCadena(s));
    }    
}
