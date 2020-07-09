package variablesDia08;

import java.util.Scanner;

//Solicita los euros por teclado, y se muestra cuentas monedas y billetes de 50,20, 10 5 y 1.

public class MaquinaMonedas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas monedas de euro vas a meter?");
        int monedas = sc.nextInt();
        System.out.println("Eah, " + monedas + "€ se lo vamos a devolver con:");

        int bill50;
        int bill20;
        int bill10;
        int bill5;
        int mon1;

        bill50 = monedas/50;
        monedas = monedas%50;
        bill20 = monedas/20;
        monedas = monedas%20;
        bill10 = monedas/10;
        monedas = monedas%10;
        bill5 = monedas/5;
        mon1 = monedas%5;

        System.out.println(bill50 + " billetes de 50€.\n" +
                bill20 + " billetes de 20€. \n" +
                bill10 + " billetes de 10€. \n" +
                bill5 + " billetes de 5€. \n" +
                mon1 + " monedas de 1€." );

    }
}
