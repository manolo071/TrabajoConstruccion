package monolitica;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Monolitica {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        try (PrintWriter salida = new PrintWriter("c:/Monolitica/datos.txt")) {
            String cadena;
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine(); //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena); //se escribe la cadena en el fichero
                cadena = sc.nextLine(); //se introduce por teclado una cadena de texto    
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        }
    }
}
