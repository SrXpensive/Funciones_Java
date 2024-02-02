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

    }

