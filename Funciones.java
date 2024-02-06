import java.util.Arrays;
//Autor: Eduardo Caro Lorente - 1DAW
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
    public static boolean igualesVectores(int []vector1, int []vector2){
        if(vector1.length == vector2.length){
            for (int i=0;i<vector1.length;i++){
                if(vector1[i]!=vector2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static double multiplica(double a, double b){
        return a*b;
    }
    public static boolean esPitagoras(double x, double y, double z){
        if(multiplica(x,x)+multiplica(y,y)==multiplica(z,z)){
            return true;
        }
        return false;
    }
    public static boolean esMayorEdad(int a){
        if(a>=18){
            return true;
        }
        return false;
    }
    public static int totalMenores(int [] vector){
        int mayores = 0;
        for (int i = 0; i < vector.length; i++){
            if(esMayorEdad(vector[i])){
                mayores++;
            }
        }
        return (vector.length-mayores);
    }
    public static int fibonacci(int a){
        int x;
        if(a == 0 || a == 1){
            return 1;
        }else{
            x = fibonacci(a-1)+fibonacci(a-2);
        }
        return x;
    }

    }

