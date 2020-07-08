package variablesDia08;

import java.util.Scanner;

//Solicitar un número entero por teclado de TRES CIFRAS y muestra por pantalla el numero al revés (utilizar arrays)
public class NumeroAlVerres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº entero de 3 cifras para imprimirlo del verrés: ");
        int num = sc.nextInt();
        int[] numero = new int[3];
        numero[0] = num/100;
        numero[1] = (num/10)-(numero[0]*10);
        numero[2] = num - (numero[0]*100) - (numero[1]*10);

        System.out.println("El número " + num + " invertido es el: ");
        for(int i = numero.length - 1; i >= 0; i--){
            System.out.print(numero[i]);
        }
        //registrando los numeros en el orden numero[2], numero[1], numero[0] (al revés de como les he asignado los nº en
        //el ejercicio, da la opción de iterar con el for de manera normal (int i = 0, i > numero.length; i++){...


    }
}
