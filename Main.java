
public class Main {
    public static void main(String[] args) {
        int opcion;
        int [] array1 = new int []{1,2,3,4,5};
        int [][] matriz1 = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        do{
            System.out.println("1. Ejercicio 1 - Mostrar Vector");
            opcion = Leer.leerEntero("Introduce una opción: ");
            switch(opcion){
                case 1:
                    Funciones.mostrarVectorInt(array1);
                    break;
                case 2:

            }
        }while(opcion != 0);

    }
}