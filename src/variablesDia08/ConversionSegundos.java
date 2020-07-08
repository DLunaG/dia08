package variablesDia08;

import java.util.Scanner;

//Solicitar   un   número   entero   por   teclado   y   muestra   los   segundos   en   horasminutos y segundos.
public class ConversionSegundos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº que simule unos segundos dados: ");
        int input = sc.nextInt();
        int calc = input;
        int horas = 0;
        int min = 0;
        int seg = 0;

        if (calc >= 3600){
            horas = calc/3600;
            calc = calc % 3600;
        }
        if (calc >= 60){
            min = calc/60;
            seg = calc % 60;
        }

        System.out.println(input + " segundos son: " + horas + " horas, "+ min +" minutos y " + seg + " segundos.");


    }
}
