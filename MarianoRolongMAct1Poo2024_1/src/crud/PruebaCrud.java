/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Prueba;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class PruebaCrud implements InterfazCrud<Prueba> {

    private HashMap<String, Prueba> infoPrueba;
    
    @Override
    public void agregar(Prueba objeto) throws Exception {
        try {
            if(infoPrueba.containsKey(objeto.getSala())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoPrueba.put(objeto.getSala(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public Prueba buscar(Prueba codigo) throws Exception {
        
        try {
            if(!infoPrueba.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoPrueba.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(Prueba objeto) throws Exception  {
       try {
            if(!infoPrueba.containsKey(objeto.getSala())){
                throw new Exception("El objeto no esta registrado");
            }
           infoPrueba.put(objeto.getSala(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }



    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoPrueba.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoPrueba.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }



    @Override
    public List<Prueba> listarTodo() throws Exception  {
        List<Prueba> Pruebas = new ArrayList<>();
        
        try {
            
            if(infoPrueba.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Prueba> indentificacion : infoPrueba.entrySet()){
            
            String alamir = indentificacion.getKey();
               
            Prueba prueba = indentificacion.getValue(); 
            
            Pruebas.add(prueba);
            }
            return Pruebas;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }




    @Override
    public int contar() throws Exception {
       List<Prueba> NumeroPrueba = listarTodo();
       
       int NumeroPruebas = 0;
       
        try {
            NumeroPruebas = NumeroPrueba.size();
            if(NumeroPruebas == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroPruebas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}

