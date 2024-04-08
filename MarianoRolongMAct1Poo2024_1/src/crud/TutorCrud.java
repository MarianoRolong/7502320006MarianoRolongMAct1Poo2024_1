/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Tutor;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class TutorCrud implements InterfazCrud<Tutor> {

    private HashMap<String, Tutor> infoTutor;
    
    @Override
    public void agregar(Tutor objeto) throws Exception {
        try {
            if(infoTutor.containsKey(objeto.getNombreTutor())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoTutor.put(objeto.getNombreTutor(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public Tutor buscar(Tutor codigo) throws Exception {
        
        try {
            if(!infoTutor.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoTutor.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(Tutor objeto) throws Exception {
       try {
            if(!infoTutor.containsKey(objeto.getNombreTutor())){
                throw new Exception("El objeto no esta registrado");
            }
            infoTutor.put(objeto.getNombreTutor(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoTutor.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoTutor.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public List<Tutor> listarTodo() throws Exception {
        List<Tutor> Tutores = new ArrayList<>();
        
        try {
            
            if(infoTutor.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Tutor> indentificacion : infoTutor.entrySet()){
            
            String yeison = indentificacion.getKey();
               
            Tutor tutor = indentificacion.getValue(); 
            
            Tutores.add(tutor);
            }
            return Tutores;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public int contar() throws Exception {
       List<Tutor> NumeroTutor = listarTodo();
       
       int NumeroTutores = 0;
       
        try {
            NumeroTutores = NumeroTutor.size();
            if(NumeroTutores == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroTutores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}

