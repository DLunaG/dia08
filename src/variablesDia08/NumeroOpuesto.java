package variablesDia08;

//Solicitar   un   número   entero   por   teclado   y   muestra   por   pantalla   su   valor absoluto.

import java.util.Scanner;

public class NumeroOpuesto {

    public static void main(String[] args) {

        int numAbs = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº para hallar su nº absoluto: ");
        int num = sc.nextInt();
        //int numAbs = Math.abs(num);
        if (num < 0){
            numAbs = num*(-1);
        }else{
            numAbs = num;
        }
        System.out.println("El absoluto de " + num + " es " + numAbs);

    }
}
