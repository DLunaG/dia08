package variablesDia08;

import java.util.Scanner;

//Solicitar   un   números   enteros   por   teclado   y   marcar   sus   números   pares contiguos.
public class ParesContiguos {

    public static void main(String[] args) {

        int numParAtras;
        int numParDelante;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº entero para hallar sus pares contíguos: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            numParAtras = num - 2;
            numParDelante = num + 2;
        }else{
            numParAtras = num - 1;
            numParDelante = num + 1;
        }
        System.out.println("Los pares contiguos de " + num + " son " + numParAtras + " y " + numParDelante);


    }
}
