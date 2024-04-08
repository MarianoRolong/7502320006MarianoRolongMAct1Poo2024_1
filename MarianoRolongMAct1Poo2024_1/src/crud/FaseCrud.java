/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Fase;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class FaseCrud implements InterfazCrud<Fase>{

    private HashMap<Integer, Fase> infoFase;
    
    @Override
    public void agregar(Fase objeto) throws Exception  {
        try {
            if(infoFase.containsKey(objeto.getNumeroIdentificacion())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoFase.put(objeto.getNumeroIdentificacion(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public Fase buscar(Fase codigo) throws Exception  {
        
        try {
            if(!infoFase.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoFase.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(Fase objeto) throws Exception  {
       try {
            if(!infoFase.containsKey(objeto.getNumeroIdentificacion())){
                throw new Exception("El objeto no esta registrado");
            }
            infoFase.put(objeto.getNumeroIdentificacion(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoFase.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoFase.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public List<Fase> listarTodo() throws Exception {
        List<Fase> Fases = new ArrayList<>();
        
        try {
            
            if(infoFase.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<Integer, Fase> indentificacion : infoFase.entrySet()){
            
            Integer alumar = indentificacion.getKey();
               
            Fase fase = indentificacion.getValue(); 
            
            Fases.add(fase);
            }
            return Fases;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }



    @Override
    public int contar() throws Exception {
       List<Fase> NumeroIdentificacion = listarTodo();
       
       int NumeroIdentificaciones = 0;
       
        try {
            NumeroIdentificaciones = NumeroIdentificacion.size();
            if(NumeroIdentificaciones == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroIdentificaciones;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}
