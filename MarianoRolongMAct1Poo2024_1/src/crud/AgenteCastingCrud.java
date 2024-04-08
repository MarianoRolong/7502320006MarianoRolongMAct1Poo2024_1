/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.AgenteCasting;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class AgenteCastingCrud implements InterfazCrud<AgenteCasting>{
    
private HashMap<String, AgenteCasting> infoAgentesCastings;

    @Override
    public void agregar(AgenteCasting objeto) throws Exception {
        try {
            if(infoAgentesCastings.containsKey(objeto.getNumeroEmpleado())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoAgentesCastings.put(objeto.getNumeroEmpleado(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

    @Override
    public AgenteCasting buscar(AgenteCasting codigo) throws Exception {
        
        try {
            if(!infoAgentesCastings.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoAgentesCastings.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }

       
    

    @Override
    public void editar(AgenteCasting objeto)throws Exception {
       try {
            if(!infoAgentesCastings.containsKey(objeto.getNumeroEmpleado())){
                throw new Exception("El objeto no esta registrado");
            }
            infoAgentesCastings.put(objeto.getNumeroEmpleado(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }



    @Override
    public List<AgenteCasting> listarTodo() throws Exception {
        List<AgenteCasting> AgentesCastings = new ArrayList<>();
        
        try {
            
            if(infoAgentesCastings.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, AgenteCasting> indentificacion : infoAgentesCastings.entrySet()){
            
            String llave = indentificacion.getKey();
               
            AgenteCasting agenteCasting = indentificacion.getValue(); 
            
            AgentesCastings.add(agenteCasting);
            }
            return AgentesCastings;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }



    @Override
    public int contar() throws Exception {
       List< AgenteCasting> NumeroAgen = listarTodo();
       
       int NumeroAgencias = 0;
       
        try {
            NumeroAgencias = NumeroAgen.size();
            if(NumeroAgencias == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroAgencias;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoAgentesCastings.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoAgentesCastings.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

     
}



    

