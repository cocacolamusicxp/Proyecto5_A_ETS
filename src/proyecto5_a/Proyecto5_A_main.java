package proyecto5_a;

import java.util.logging.Level;
import java.util.logging.Logger;

/*Esto es un comentario
ocupando varias líneas*/

/**@author Daniel
 */
public class Proyecto5_A_main {
    private static final Logger LOG = Logger.getLogger(Proyecto5_A_main.class.getName());
    
    public static void main(String[] args){
        Proyecto_5_A_metodos obj = new Proyecto_5_A_metodos();
        
        double[] notas = {2, 3.6, 8.4, 6.32, 9.75, 1.75, 4.56, 4.9, 6.9, 4.2};
        String[] alumnos = {"Rodrigo del Pueblo", "Roberto Carlos", "Enrique", "Irelia", "Sebas", "Tian", "Ernesto", "César", "Akali", "Snoopy"};

        //Ahora lo hará tres veces
        for (int i = 0; i < 3; i++) {
            try{
                System.out.println("El índice buscado es: "+obj.mejorNota(notas)+"\n");
                obj.mejorAlumno(alumnos,obj.mejorNota(notas));//Vuelve a haber un comentario aqui
                LOG.log(Level.INFO, "El programa se ha repetido "+i+" veces"); 
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("--Ha ocurrido un error en la lectura del array--");
            }
        }
    }
}