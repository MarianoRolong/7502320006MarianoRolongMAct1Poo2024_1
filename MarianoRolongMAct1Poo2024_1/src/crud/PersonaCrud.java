/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Persona;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class PersonaCrud implements InterfazCrud<Persona>{
    private HashMap<String, Persona> infoPersona;

    @Override
    public void agregar(Persona objeto) throws Exception  {
        try {
            if(infoPersona.containsKey(objeto.getApellido())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoPersona.put(objeto.getApellido(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }



    @Override
    public Persona buscar(Persona codigo) throws Exception {
        
        try {
            if(!infoPersona.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoPersona.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }

    @Override
    public void editar(Persona objeto) throws Exception {
       try {
            if(!infoPersona.containsKey(objeto.getApellido())){
                throw new Exception("El objeto no esta registrado");
            }
            infoPersona.put(objeto.getApellido(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoPersona.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoPersona.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public List<Persona> listarTodo() throws Exception {
        List<Persona> personas = new ArrayList<>();
        
        try {
            
            if(personas.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Persona> indentificacion : infoPersona.entrySet()){
            
            String amar = indentificacion.getKey();
               
            Persona persona = indentificacion.getValue(); 
            
            personas.add(persona);
            }
            return personas;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }



    @Override
    public int contar() throws Exception 
{
       List<Persona> NumeroPersona = listarTodo();
       
       int NumeroPersonas = 0;
       
        try {
            NumeroPersonas = NumeroPersona.size();
            if(NumeroPersonas == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroPersonas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}

