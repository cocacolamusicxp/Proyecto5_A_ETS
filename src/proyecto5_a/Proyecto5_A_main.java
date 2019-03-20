package proyecto5_a;

/*Esto es un comentario
ocupando varias líneas*/

/**@author Daniel
 */
public class Proyecto5_A_main {
    public static void main(String[] args){
        Proyecto_5_A_metodos obj = new Proyecto_5_A_metodos();
        
        double[] notas = {2, 3.6, 8.4, 6.32, 9.75, 1.75, 4.56, 4.9, 6.9, 4.2};
        String[] alumnos = {"Rodrigo del Pueblo", "Roberto Carlos", "Enrique", "Irelia", "Sebas", "Tian", "Ernesto", "César", "Akali", "Snoopy"};
        
        System.out.println("El índice buscado es: "+obj.mejorNota(notas)+"\n");
        obj.mejorAlumno(alumnos,obj.mejorNota(notas));//Esto es otro comentario
    }
}