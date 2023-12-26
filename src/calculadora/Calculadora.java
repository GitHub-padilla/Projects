/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operador;

        System.out.print("Ingrese el numero 1: ");
        try{
            num1 = Double.parseDouble(scanner.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Solo se puede ingresar numeros");
            return;
        }
        

        System.out.print("Ingrese el numero 2: ");
        try{
            num2 = Double.parseDouble(scanner.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Solo se puede ingresar numeros");
            return;
        }
        

        System.out.print("Ingrese el operador(+, -, x, /): ");
        try{
            operador = scanner.next().charAt(0);

        }catch(NumberFormatException e){
            System.out.println("Solo se puede ingresar numeros");
            return;
        }
        
        switch (operador) {
            case '+':
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case '-':
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case 'x':
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("El resultado es: " + (num1 / num2));
                }else{
                    System.out.println("No se puede dividir por cero");
                }
                
                break;
            default:
                System.out.println("Operador no valido");
                break;
        }

    }

}
