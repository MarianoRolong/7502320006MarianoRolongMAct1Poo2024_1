/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Experiencia;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class ExperienciaCrud implements InterfazCrud<Experiencia>{

    private HashMap<String, Experiencia> infoExperiencia;
    
    @Override
    public void agregar(Experiencia objeto) throws Exception {
        try {
            if(infoExperiencia.containsKey(objeto.getNombre())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoExperiencia.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public Experiencia buscar(Experiencia codigo) throws Exception {
        
        try {
            if(!infoExperiencia.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoExperiencia.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(Experiencia objeto) throws Exception {
       try {
            if(!infoExperiencia.containsKey(objeto.getNombre())){
                throw new Exception("El objeto no esta registrado");
            }
            infoExperiencia.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoExperiencia.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoExperiencia.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public List<Experiencia> listarTodo() throws Exception {
        List<Experiencia> experiencias = new ArrayList<>();
        
        try {
            
            if(infoExperiencia.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Experiencia> indentificacion : infoExperiencia.entrySet()){
            
            String uwu = indentificacion.getKey();
               
            Experiencia experiencia = indentificacion.getValue(); 
            
            experiencias.add(experiencia);
            }
            return experiencias;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public int contar() throws Exception {
       List<Experiencia> NumeroExperiencia = listarTodo();
       
       int NumeroExperiencias = 0;
       
        try {
            NumeroExperiencias = NumeroExperiencia.size();
            if(NumeroExperiencias == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroExperiencias;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}

