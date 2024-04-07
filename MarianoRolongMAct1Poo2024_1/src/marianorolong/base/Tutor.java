/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

/**
 *
 * @author maria
 */
public class Tutor {
    //PROPIEDADES
    private int id;
    private String nombreTutor;
    private CandidatoNino candidatoNino;
    
 public Tutor(){
 
 }

    public Tutor(String nombreTutor, CandidatoNino candidatoNino) {
        this.nombreTutor = nombreTutor;
        this.candidatoNino = candidatoNino;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }
     public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public CandidatoNino getCandidatoNino() {
        return candidatoNino;
    }

    @Override
    public String toString() {
        return "Tutor{" + "\n NombreTutor: " + nombreTutor + '}';
    }

   

}
