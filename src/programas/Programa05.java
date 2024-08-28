//Escriba un programa que determine si se aprobó un curso en base a su nota final
package programas;
import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args){
        //Declarar variabes
        int nota;
        String mensaje;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa la nota obtenida: ");
        nota=lectura.nextInt();
        //Proceso de datos
        if(nota>=12){
            mensaje="Felicitaciones, aprobaste";
        }else{
            mensaje="Lamentablemente reprobaste";
        }
        //Salida de datos
        System.out.println(mensaje);
    }
}
