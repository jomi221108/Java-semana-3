//Escribe un programa que lea la temperatura (en grados Celsius) e indique si es un día caluroso (mayor o igual a 30°C).
package programas;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args){
        //Declarar variabes
        int grados;
        String mensaje="Temperatura normal";
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce la temperatura en grados Celsius: ");
        grados=lectura.nextInt();
        //Proceso de datos
        if(grados>=30){
            mensaje="Es un día caluroso";
        }
        //Salida de datos
        System.out.println(mensaje);
    }
}
