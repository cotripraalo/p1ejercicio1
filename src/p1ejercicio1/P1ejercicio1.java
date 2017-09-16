/*Desarrolle  una  aplicación  que  permita  ingresar  un 
número en base decimal  y muestre su representación en base binaria.
En este caso podemos emplear la herramienta recursividad la cual se emplea 
para llamarse a uno mismo
 */
package p1ejercicio1;

import java.util.Scanner;

public class P1ejercicio1 {

    public static void main(String[] args) {
       
        // Creamos un Scanner 
        Scanner decimal= new Scanner(System.in);
        
        //Pedimos al usuario que ingrece un numero decimal
        System.out.print("INGRESA NUMERO DECIMAL :  ");
        
        int numero=decimal.nextInt();
        
        // PLANTEAMOS LOS CASOS DE CONVERSION 
       
        if (numero>=0)
            {
                
            System.out.println();
            System.out.print("EL NUMERO BINARIO EQUIVALENTE : ");
            conversion(numero);
            
            }
       
        else
            {
                
            /*
            Usando esta operacion ya que los numeros negativos 
            tambien tienen equivalente binario.
            */
                
            numero=numero/-1;
            System.out.print("EL NUMERO BINARIO EQUIVALENTE : ");
            conversion(numero);
            
            }  
        
    }
    
             /*
             Creando metodo denominado conversion que permite convertir 
             la misma clase a otra o a asi misma
             */
    
    public static void conversion(int numero)
            {
            if(numero<2)
                {
                    
                System.out.print(numero);
                
                }
            
            else
                {
                    
                conversion(numero/2);
                System.out.print(numero%2);
                
                }
        
        }
    
}
