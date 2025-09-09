/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezescobar_20250908;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TAMAÑO DEL ARREGLO
        int cantidad_elementos = 5;
        
        //CREACIÓN E INSTANCIA ARREGLO DE NÚMEROS DESORDENADOS
        int[] numeros_desordenados = new int[cantidad_elementos];
        
        //CREACIÓN E INSTANCIA DE ARREGLO DE NÚMEROS ORDENADOS
        int[] numeros_ordenados = new int[cantidad_elementos];
        
        //CREACIÓN E INSTANCIA DE OBJETO SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //NOTIFICACIÓN AL USUARIO PARA INDICARLE QUE DEBE INGRESAR VALORES ENTEROS
        System.out.println("Por favor ingresar "+cantidad_elementos+" numeros de manera desordenada");
        
        //SE RECORRE EL ARREGLO DE NUMEROS ENTEROS DESORDENADOS QUE POR DEFECTO
        //TIENEN EL VALOR DE CERO
            for(int i = 0; i<numeros_desordenados.length; i++) {
        
        //SE SOLICITA AL USUARIO EL INGRESO DE UN VALOR
            System.out.print("Digite el elemento: "+(i+1)+": ");
        
        //SE DIGITA UN VALOR DESDE EL TECLADO DE TIPO ENTERO
            numeros_desordenados[i] = scanner.nextInt();
    }
        
        //SE IMPRIME UNA SALIDA AL USUARIO PARA MOSTRAR LO QUE DIGITADO
        System.out.println("Usted digito los siguientes numeros:");
        
        //SE RECORRE EL ARREGLO DE VALORES DIGITADOS
        for(int j = 0; j < numeros_desordenados.length; j++){
            
            //SE IMPRIMEN LOS NÚMEROS DIGITADOS POR EL USUARIO
            //ALMACENADOS EN EL ARREGLO DE NUMEROS DESORDENADOS
            System.out.print(numeros_desordenados[j]+" ");
        }
        
        //HACEMOS UN SALTO DE LINEA
        System.out.println();
        
        //INVOCAMOS LA FUNCIÓN PARA ORDENAR EL ARREGLO
        numeros_ordenados = ordenar(numeros_desordenados);
        
        //IMPRIMIMOS LA SALIDA AL USUARIO
        System.out.println("Los numeros ordenados son: ");
        
        //SE RECORRE EL ARREGLO PARA OBTENER CADA VALOR
        //DEL ARREGLO ORDENADO
        for(int k=0; k < numeros_ordenados.length; k++){
            
            //SE IMPRIME VALOR DE CADA ELEMENTO
            System.out.print(numeros_ordenados[k]+" ");
        }
        
    }
    
    //FUNCIÓN PARA ORDENAR UN ARREGLO UNIDIMENSIONAL
    public static int[] ordenar(int [] arreglo){
        
        //SE RECORRE EL ARREGLO PARA EVALUAR CADA POSICIÓN
        for(int i=0; i < arreglo.length - 1; i++){
            
            //SE HACE UN SEGUNDO RECORRIDO PARA PODER COMPARAR
            //LA POSICIÓN ACTUAL CON LA POSICIÓN SIGUIENTE
            for(int j=0; j < arreglo.length - 1; j++){
                
              
                //SE EVALUA EL VALOR DE CADA ELEMENTO 
                //EN EL ARREGLO
                if(arreglo[j] > arreglo[j+1]){
                    
                    //SI ES MAYOR, SE CREA UNA VARIABLE PARA ALMACENAR EL VALOR
                    //DEL ELEMENTO MAYOR
                    int mayor = arreglo[j];
                    
                    //SE CAMBIA LA POSICIÓN DEL ELEMENTO ACTUAL
                    arreglo[j] = arreglo[j+1];
                    
                    //SE INTERCAMBIA LA POSICIÓN DEL SIGUIENTE ELEMENTO
                    //ASIGNANDO EL VALOR MAYOR
                    arreglo[j+1] = mayor;
                }
            }
            
            
        }
        
        return arreglo;
    }
    
    
}
