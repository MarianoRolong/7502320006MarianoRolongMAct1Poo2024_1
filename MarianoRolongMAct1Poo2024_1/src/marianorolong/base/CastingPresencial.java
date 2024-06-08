/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

import java.util.List;

/**
 *
 * @author maria
 */
public class CastingPresencial {
    //PROPIEDADES
   private int id;
   //private int numeroPersonasRequeridas; 
   private AgenteCasting agenteCasting;
   private List<Fase> fases;  
//CONSTRUCTORES
    public CastingPresencial (){
    
    }

    /*public CastingPresencial(int numeroPersonasRequeridas, AgenteCasting agenteCasting, Fase fases) {
        this.numeroPersonasRequeridas = numeroPersonasRequeridas;
        this.agenteCasting = agenteCasting;
        this.fases.add(fases);
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public int getNumeroPersonasRequeridas() {
        return numeroPersonasRequeridas;
    }
    public void setNumeroPersonasRequeridas(int numeroPersonasRequeridas) {
        this.numeroPersonasRequeridas = numeroPersonasRequeridas;
    }*/

    public AgenteCasting getAgenteCasting() {
        return agenteCasting;
    }

    public List<Fase> getFases() {
        return fases;
    }

    @Override
    public String toString() {
        return "CastingPresencial{" + "\n NumeroPersonasRequeridas: " + /*numeroPersonasRequeridas*/ +'}';
    }

    
    
}
