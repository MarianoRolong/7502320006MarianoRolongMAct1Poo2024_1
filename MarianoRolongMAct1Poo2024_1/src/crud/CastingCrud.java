/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Casting;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class CastingCrud implements InterfazCrud<Casting> {
    
private HashMap<String, Casting> infoCastings;

    @Override
    public void agregar(Casting objeto) throws Exception  {
        try {
            if(infoCastings.containsKey(objeto.getNombre())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoCastings.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

    @Override
    public Casting buscar(Casting codigo) throws Exception {
        
        try {
            if(!infoCastings.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoCastings.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(Casting objeto) throws Exception {
       try {
            if(!infoCastings.containsKey(objeto.getNombre())){
                throw new Exception("El objeto no esta registrado");
            }
            infoCastings.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception  {
        
        try {
            if(!infoCastings.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoCastings.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }



    @Override
    public List<Casting> listarTodo() throws Exception {
        List<Casting> castings = new ArrayList<>();
        
        try {
            
            if(infoCastings.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Casting> indentificacion : infoCastings.entrySet()){
            
            String aass = indentificacion.getKey();
               
            Casting casting = indentificacion.getValue(); 
            
            castings.add(casting);
            }
            return castings;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }



    @Override
    public int contar() throws Exception {
       List<Casting> NumeroCasting = listarTodo();
       
       int NumeroCastings = 0;
       
        try {
            NumeroCastings = NumeroCasting.size();
            if(NumeroCastings == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroCastings;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}


