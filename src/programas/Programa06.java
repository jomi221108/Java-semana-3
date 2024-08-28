/*Escriba un programa que lea una calificación (de 0 a 100) y muestre la nota correspondiente según el siguiente rango:
0-59:E
60-69:D
70-79:C
80-89:B
90-100:A
*/
package programas;
import java.util.Scanner;
public class Programa06 {
    public static void main(String[] args){
        //Declarar variabes
        int nota;
        String mensaje;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa tu calificación (0 - 100): ");
        nota=lectura.nextInt();
        //Proceso de datos
        if(nota>=90){
            mensaje="Tu nota es A";
        }else if(nota>=80){
            mensaje="Tu nota es B";
        }else if(nota>=70){
            mensaje="Tu nota es C";
        }else if(nota>=60){
            mensaje="Tu nota es D";
        }else{
            mensaje="Tu nota es E";
        }
        //Salida de datos
        System.out.println(mensaje);
    }
}
