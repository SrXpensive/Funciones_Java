import java.util.Arrays;

public class Funciones {

    public static void mostrarVectorInt(int []vector){
        System.out.print("[");
        for(int i = 0;i < vector.length;i++){
            if(i == vector.length-1) {
                System.out.print(vector[i]);
                }else{
                System.out.print(vector[i]+", ");
                }
        }
        System.out.println("]");
    }
    public static void mostrarMatrizInt(int [][]matriz){
        for (int i=0;i<matriz.length; i++){
            Funciones.mostrarVectorInt(matriz[i]);
        }
    }
    public static void copiar2vectores(int []vector1,int []vector2){
        System.out.println("Actualmente el vector 2 es "+Arrays.toString(vector2));
        if(vector1.length == vector2.length){
            for(int i =0;i<vector1.length;i++){
                vector2[i] = vector1[i];
            }
            System.out.println("Ahora el vector 2 es "+Arrays.toString(vector2));
            System.out.println("----------");
        }else {
            System.out.println("Los tamaños de los vectores son diferentes y no se puede llevar a cabo");
            System.out.println("----------");
        }
    }
    public static int[] copiarVector(int []vector1){
        int []vector2 = new int [vector1.length];
        Funciones.copiar2vectores(vector1,vector2);
        return vector2;
    }

    }

