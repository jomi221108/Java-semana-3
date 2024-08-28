
package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        //Definir variables
        int num;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar un número: ");
        num=lectura.nextInt();
        //Proceso de datos
        if(num>0){
            mensaje="Número positivo";
        }else if(num<0){
            mensaje="Número negativo";
        }else{
            mensaje="Número neutro";
        }
        //Salida de datos
        System.out.println(mensaje);
    }
    
}
