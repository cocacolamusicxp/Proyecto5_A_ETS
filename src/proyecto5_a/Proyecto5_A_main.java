package proyecto5_a;

import static proyecto5_a.Proyecto_5_A_metodos.mejorAlumno;
import static proyecto5_a.Proyecto_5_A_metodos.mejorNota;

/**@author Daniel
 */
public class Proyecto5_A_main {
    public static void main(String[] args){
        double[] notas = {2, 3.6, 8.4, 6.32, 9.75, 1.75, 4.56, 4.9, 6.9, 4.2};
        String[] alumnos = {"Rodrigo del Pueblo", "Roberto Carlos", "Enrique", "Irelia", "Sebas", "Tian", "Ernesto", "César", "Akali", "Snoopy"};
        
        System.out.println("El índice buscado es: "+mejorNota(notas)+"\n");
        mejorAlumno(alumnos,mejorNota(notas));
    }
}
