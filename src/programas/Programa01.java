
package programas;

import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        //Declarar variabes
        int n1,n2,n3,n4,mayor;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar el primer n�mero:");
        n1=lectura.nextInt();
        System.out.print("Ingresar el segundo n�mero:");
        n2=lectura.nextInt();
        System.out.print("Ingresar el tercer n�mero:");
        n3=lectura.nextInt();
        System.out.print("Ingresar el cuarto n�mero:");
        n4=lectura.nextInt();
        //Proceso de datos
        mayor=n1;
        if (n2>mayor) {
            mayor=n2;
        }
        if (n3>mayor) {
            mayor=n3;
        }
        if (n4>mayor) {
            mayor=n4;
        }
        //Salida de datos
        System.out.println("El n�mero mayor es: "+mayor);
    }
}
