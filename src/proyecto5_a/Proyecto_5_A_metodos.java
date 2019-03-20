package proyecto5_a;

/**@author Daniel
 */
public class Proyecto_5_A_metodos {
    public static int mejorNota(double[] notas){
        double mejorNota = 0;
        int indexNota = 0;
        
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > mejorNota){
                mejorNota = notas[i];
                indexNota = i;    
            }
        }
        return indexNota;
    }
    public static void mejorAlumno(String[] alumnos, int indexNota){
        for(int i = 0; i < alumnos.length; i++){
            if(i == indexNota){
                System.out.println("--> El nombre buscado es: "+alumnos[i]+" <--");
            }
            else{
                System.out.println(alumnos[i]+" no es");
            }
        }
    }
}
