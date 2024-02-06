import java.util.Arrays;
// Autor: Eduardo Caro Lorente - 1DAW
public class Main {
    public static void main(String[] args) {
        int opcion;
        int [] vectorCopiado;
        int [] array1 = new int []{1,2,3,4,5};
        int [] array2 = new int []{2,3,4};
        int [] array3 = new int []{3,4,5,6,7};
        int [] array4 = new int []{1,2,3,4,5};
        int [][] matriz1 = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        int [] edades = new int []{13,14,15,19,32,21,41,6,25,64,35};
        double num1;
        double num2;
        double a = 3;
        double b = 4;
        double c = 5;

        do{
            System.out.println("1. Ejercicio 1 - Mostrar Vector");
            System.out.println("2. Ejercicio 2 - Mostrar Matriz");
            System.out.println("3. Ejercicio 3 - Copiar dos vectores");
            System.out.println("4. Ejercicio 4 - Copiar un único vector");
            System.out.println("5. Ejercicio 5 - Comprobar si dos vectores son iguales");
            System.out.println("6. Ejercicio 6 - Multiplica dos números");
            System.out.println("7. Ejercicio 7 - Compruebo el teorema de pitágoras para los valores 3,4,5");
            System.out.println("8. Ejercicio 8 - Devolver el número de menores de edad en el array "+Arrays.toString(edades));
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
                    System.out.println("El vector copiado es "+Arrays.toString(vectorCopiado));
                    break;
                case 5:
                    if(Funciones.igualesVectores(array1,array2)){
                        System.out.println("Son iguales");
                    }else{
                        System.out.println("No son iguales");
                    };
                    System.out.println("------------");
                    if(Funciones.igualesVectores(array1,array4)){
                        System.out.println("Son iguales");
                    }else{
                        System.out.println("No son iguales");
                    };
                    break;
                case 6:
                    num1 = Leer.leerDouble("Introduce un número: ");
                    num2 = Leer.leerDouble("Introduce otro número: ");
                    System.out.println("El resultado de la operación es "+Funciones.multiplica(num1,num2));
                    break;
                case 7:
                    if(Funciones.esPitagoras(a,b,c)){
                        System.out.println("Se cumple el teorema");
                    }else{
                        System.out.println("No se cumple el teorema");
                    }
                    System.out.println("-----------");
                case 8:
                    System.out.println("Existen "+Funciones.totalMenores(edades)+" personas menores de edad");
            }
        }while(opcion != 0);

    }
}