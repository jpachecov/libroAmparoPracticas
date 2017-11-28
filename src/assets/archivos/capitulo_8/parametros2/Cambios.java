/**
 * Programa para ilustrar el paso de parametros por valor en Java
 * @author Amparo López Gaona
 * @version 1.
 */
public class Cambios {    
    
    /**
     * Método para modificarun arreglo de enteros
     * @param a -- arreglo de enteros
     */
    static void modificar(int[] a){
        for(int i = 0; i < a.length; i++)
            a[i] *= 2;
    }
    
    /**
     * Método para modificar un entero
     * @param a -- entero que se desea modifica
     */
    static void modificar(int a){
        a *= 2;
    }
    

    public static void main(String args[]){
        int a[] = {0,1,2,3,4,5,6};
        
        System.out.println("El arreglo original tiene");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");            
        }
        
        modificar(a);
        
        System.out.println("\nEl arreglo ahora tiene");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");            
        }
        
        modificar(a[4]);
        
        System.out.println("\nEl arreglo ahora tiene");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");               
        }
        
    }
}
