package Clase3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String args []) {

    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese un primer numero");
    int num1=input.nextInt();
    System.out.println("Ingrese un segundo numero");
    int num2=input.nextInt();
    int res=multiplicacion(num1,num2);
    System.out.println("el resultado de la multiplicacion entre "+num1+" y "+num2+" es: "+res);
}
    public static int multiplicacion(int num1,int num2){
        return num1*num2;
    }

}