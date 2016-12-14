/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolibreriamain;
import Operaciones.*;
import Validaciones.*;
import java.util.Scanner;
/**
 *
 * @author otorradomiguez
 */
public class EjemploLibreriaNotasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1=new Scanner(System.in);
        //Nota teoria 40%
        System.out.println("Pon la nota del primer examen y pulsa Enter para validarla. \nA continuacion haz lo mismo con la del segundo");
        float mediaTeoria=Calculos.suma(ValidaFloat.validarFloat(sc1.nextFloat()),ValidaFloat.validarFloat(sc1.nextFloat()))/2;
        System.out.println("Media teoria: "+mediaTeoria);
        //Nota practico
        System.out.println("Indica la nota del examen práctico");
        float notaPractico=ValidaFloat.validarFloat(sc1.nextFloat());
        System.out.println("Nota Practico: "+notaPractico);
        //Nota actividades
        System.out.println("Indica cuantos Boletines tienes hechos");
        int boletinesHechos=sc1.nextInt();
        System.out.println("Indica cuantos boletines eran en total");
        int boletinesTotal=sc1.nextInt();
        float porcentajeActividades=((float)boletinesHechos/(float)boletinesTotal)*100;
        System.out.println(porcentajeActividades);
        int notaActividades;
        if (porcentajeActividades>=90){
            notaActividades=2;
        }
        else if (porcentajeActividades>=70){
            notaActividades=1;
        }
        else{
            notaActividades=0;
        }
        System.out.println("Nota Actividades: "+notaActividades);
        float notaMedia=(mediaTeoria*0.4f)+(notaPractico*0.4f)+notaActividades;
        System.out.println("Tu nota media es de: "+notaMedia);
    }
    
}
