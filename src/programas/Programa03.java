
package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        //Definir variables
        int num;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar un n�mero: ");
        num=lectura.nextInt();
        //Proceso de datos
        if(num>0){
            mensaje="N�mero positivo";
        }else if(num<0){
            mensaje="N�mero negativo";
        }else{
            mensaje="N�mero neutro";
        }
        //Salida de datos
        System.out.println(mensaje);
    }
    
}
