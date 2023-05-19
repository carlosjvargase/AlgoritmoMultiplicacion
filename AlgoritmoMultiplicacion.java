import java.util.Scanner;

public class AlgoritmoMultiplicacion {
    public static void main(String[] args) {
        //Multiplica 2 numeros sin necesidad de multiplicar y mostrar por pantalla.

        int num1;
        int num2;
        int res=0;

        System.out.println("Indique el numero 1: ");
        Scanner sc= new Scanner (System.in);
        num1=sc.nextInt();

        System.out.println("Indique el numero 2: ");
        num2=sc.nextInt();

        for (;num2>0;num2--)res+=num1;

        System.out.println("El resultado de la multiplicación es: " + res);

    }
}
