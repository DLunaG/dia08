package variablesDia08;

import java.util.Scanner;

public class MultiplicacionConSumas {

    public static void main(String[] args) {

        //Dados dos números enteros positivos y/o negativos, realiza una miltiplicación solamente sumando.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº entero negativo o positivo: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro nº entero negativo o positivo: ");
        int num2 = sc.nextInt();

        int num1Mod = Math.abs(num1);
        int num2Mod = Math.abs(num2);

        for(int i = 1; i < num1Mod; i++){
            num2Mod += num2Mod;
        }
        if ((num1 < 0 && num2 < 0)||(num1 >= 0 && num2 >= 0)){
            System.out.println("Resultado: "+num2Mod);
        }else{
            System.out.println("Resultado: "+num2Mod*(-1));
        }

    }
}
