/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

/**
 *
 * @author maria
 */
public class AgenteCasting {
    //PROPIEDADES
    private int id;
    private String numeroEmpleado;
    private CastingPresencial castingPresencial;

//CONSTRUCTORES
    public AgenteCasting (){
    
    }

    public AgenteCasting(String numeroEmpleado, CastingPresencial castingPresencial) {
        this.numeroEmpleado = numeroEmpleado;
        this.castingPresencial = castingPresencial;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }
    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    public CastingPresencial getCastingPresencial() {
        return castingPresencial;
    }

    @Override
    public String toString() {
        return "AgenteCasting{" + "\n NumeroEmpleado: " + numeroEmpleado + '}';
    }

    
}