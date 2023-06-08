/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejercicioextra10;

import java.util.Scanner;

public class EjercicioExtra10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        
        int multiplicacion = num1 * num2;
        
        System.out.println("Numero 1: "+num1+", numero 2: "+num2);
        System.out.println("Resultado: "+multiplicacion);
        System.out.print("Ingresa el resultado de la multiplicación: ");
        int resultado = entrada.nextInt();
        
        while(resultado != multiplicacion){
            System.out.print("Incorrecto, ingresa nuevamente el resultado de la multiplicación: ");
            resultado = entrada.nextInt();
        }
        System.out.println("Felicidades, has adivinado el resultado de la multiplicación");
    }
    
}
