/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

/**
 *
 * @author maria
 */
public class CandidatoNino {
    //PROPIEDADES
    private int id;
    private String nombreTutor;
    private Tutor tutor;

//CONSTRUCTORES
    public CandidatoNino (){
    
    }

    public CandidatoNino(String nombreTutor, Tutor tutor) {
        this.nombreTutor = nombreTutor;
        this.tutor = tutor;
    }

    public String getNombreTutor() {
        return nombreTutor;
    } 
    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "CandidatoNino{" + "\n NombreTutor: " + nombreTutor + '}';
    }

   

}
