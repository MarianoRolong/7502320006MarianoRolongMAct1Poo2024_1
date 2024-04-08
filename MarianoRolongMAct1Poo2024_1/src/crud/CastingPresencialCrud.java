/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.CastingPresencial;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class CastingPresencialCrud implements InterfazCrud<CastingPresencial>{

    private HashMap<Integer, CastingPresencial> infoCastingPresenciales;

    
    @Override
    public void agregar(CastingPresencial objeto) throws Exception {
        try {
            if(infoCastingPresenciales.containsKey(objeto.getId())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoCastingPresenciales.put(objeto.getId(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public CastingPresencial buscar(CastingPresencial codigo) throws Exception {
        
        try {
            if(!infoCastingPresenciales.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoCastingPresenciales.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(CastingPresencial objeto) throws Exception  {
       try {
            if(!infoCastingPresenciales.containsKey(objeto.getId())){
                throw new Exception("El objeto no esta registrado");
            }
            infoCastingPresenciales.put(objeto.getId(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoCastingPresenciales.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoCastingPresenciales.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }



    @Override
    public List<CastingPresencial> listarTodo() throws Exception {
        List<CastingPresencial> CastingsPresenciales = new ArrayList<>();
        
        try {
            
            if(infoCastingPresenciales.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<Integer, CastingPresencial> indentificacion : infoCastingPresenciales.entrySet()){
            
            Integer tucum = indentificacion.getKey();
               
            CastingPresencial castingPresencial = indentificacion.getValue(); 
            
            CastingsPresenciales.add(castingPresencial);
            }
            return CastingsPresenciales;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public int contar() throws Exception {
       List<CastingPresencial> NumeroCastingPresencial = listarTodo();
       
       int NumeroCastingsPresenciales = 0;
       
        try {
            NumeroCastingsPresenciales = NumeroCastingPresencial.size();
            if(NumeroCastingsPresenciales == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroCastingsPresenciales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}


    

