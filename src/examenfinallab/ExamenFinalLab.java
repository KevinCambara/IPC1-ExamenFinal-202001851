/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinallab;

import java.util.Scanner;

/**
 *
 * @author camba
 */
public class ExamenFinalLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select = 0;
        int num1;
        int num2;
        int impar = 0;
        int asteriscos;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que ejercicio desea Realizar:");
            System.out.println("Ejercicio 1:");
            System.out.println("Ejercicio 2:");
            System.out.println("Ejercicio 3:");
            System.out.println("Salir 4:");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextInt();
                    if (num1 > num2) {
                        System.out.println("El primer numero ingresado es el mayor");
                    } else {
                        System.out.println("El segundo numero ingresado es el mayor");
                    }
                    break;
                case 2:
                    boolean terminar = false;
                    do {
                        System.out.println("Ingrese un numero impar");
                        asteriscos = sc.nextInt();
                        if (asteriscos % 2 != 0) {
                            System.out.println();
                            for (int altura = 1; altura <= Math.ceil((float) asteriscos / 2); altura++) {
                                for (int blancos = 1; blancos <= asteriscos - altura; blancos++) {
                                    System.out.print(" ");
                                }
                                for (int ast = 1; ast <= (altura * 2) - 1; ast++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            System.out.println("Piramide Dibujada con base " + asteriscos);
                            terminar = true;
                        } 
                    } while (!terminar);

                    break;
                case 3:
                    System.out.println("Aqui deberia de ir el Ejercicio 3"
                            + " Pero le paso lo mismo que la Xavineta, pincho");
            }

        } while (select != 4);

    }

}
