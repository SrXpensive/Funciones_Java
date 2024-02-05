import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int opcion;
        int [] vectorCopiado;
        int [] array1 = new int []{1,2,3,4,5};
        int [] array2 = new int []{2,3,4};
        int [] array3 = new int []{3,4,5,6,7};
        int [][] matriz1 = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        do{
            System.out.println("1. Ejercicio 1 - Mostrar Vector");
            System.out.println("2. Ejercicio 2 - Mostrar Matriz");
            System.out.println("3. Ejercicio 3 - Copiar dos vectores");
            System.out.println("4. Ejercicio 4 - Copiar un único vector");
            opcion = Leer.leerEntero("Introduce una opción: ");
            switch(opcion){
                case 1:
                    Funciones.mostrarVectorInt(array1);
                    break;
                case 2:
                    Funciones.mostrarMatrizInt(matriz1);
                    break;
                case 3:
                    Funciones.copiar2vectores(array1,array2);
                    Funciones.copiar2vectores(array1,array3);
                    break;
                case 4:
                    vectorCopiado = Funciones.copiarVector(array3);
                    
            }
        }while(opcion != 0);

    }
}