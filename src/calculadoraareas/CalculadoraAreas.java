
package calculadoraareas;

import java.util.Scanner;

public class CalculadoraAreas {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
      
        int opcion = 0;

        do {
          
            System.out.println("---- MENÚ ----");
            System.out.println("1. Calcular el área de un rectángulo");
            System.out.println("2. Calcular el área de un cuadrado");
            System.out.println("3. Calcular el área de un triángulo");
            System.out.println("4. Calcular el área de un círculo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
           
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                  
                    System.out.println("¡Hasta pronto!");
                    break;
                case 1:
                    System.out.println("Has elegido calcular el área de un rectángulo.");
                  
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRect = sc.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRect = sc.nextDouble();
                    double areaRect = baseRect * alturaRect;
                    System.out.println("El área del rectángulo es: " + areaRect);
                    break;
                case 2:
                    System.out.println("Has elegido calcular el área de un cuadrado.");
                
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuad = sc.nextDouble();
                    double areaCuad = ladoCuad * ladoCuad;
                    System.out.println("El área del cuadrado es: " + areaCuad);
                    break;
                case 3:
                    System.out.println("Has elegido calcular el área de un triángulo.");
                
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTriang = sc.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTriang = sc.nextDouble();
                    double areaTriang = (baseTriang * alturaTriang) / 2;
                    System.out.println("El área del triángulo es: " + areaTriang);
                    break;
                case 4:
                    System.out.println("Has elegido calcular el área de un circulo.");
             
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirc = sc.nextDouble();
                    double areaCirc = Math.PI * radioCirc * radioCirc;
                    System.out.println("El área del círculo es: " + areaCirc);
                    break;
                default:
                  
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (opcion != 0);

       
        sc.close();
    }
}