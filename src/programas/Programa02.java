
package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        //Declarar variables
        int edad;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese su edad:");
        edad=lectura.nextInt();
        //Proceso de datos
        if(edad>=18){
            mensaje="Es mayor de edad";
        }else{
            mensaje="Es menor de edad";
        }
        //Salida de datos
        System.out.println(mensaje);
    }
    
}
