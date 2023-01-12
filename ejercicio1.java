/*
 * Ejercicio 1
 * 
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es elmáximo. Si el usuario introduce 
 * un dato erróneo (algo que no sea un númeroentero) el programa debe indicarlo y debe pedir de nuevo el número.
 * 
 * @author Antonio Luis Garcia 
 */

import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int mayor = Integer.MIN_VALUE;
        boolean noEntero = false;

        for(int i = 1 ; i <= 5 ; i++){

            
            do{
                
                try{
                    noEntero = false;
                    
                    System.out.println("Diga un numero entero:");
                    numero = Integer.parseInt(sc.nextLine());
    
                    if(numero>mayor){
                        mayor = numero;
                    }
                    noEntero = true;
    
                }catch(Exception e){
    
                    System.out.println("Excepción: " + e.getClass());
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Introduzca un numero entero ");
                }

            }while(!noEntero);
        }

        System.out.println("El mayor es el " + mayor);

        sc.close();
    }
}