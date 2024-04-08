/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Agencia;
import model.InterfazCrud;

/** 
 *
 * @author maria
 */
public class AgenciaCrud implements InterfazCrud<Agencia> {

    private HashMap<String, Agencia> infoAgencias;
    
    @Override
    public void agregar(Agencia objeto) throws Exception {
        try {
            if(infoAgencias.containsKey(objeto.getNombre())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoAgencias.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

    @Override
    public Agencia buscar(Agencia codigo) throws Exception {
        
        try {
            if(!infoAgencias.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoAgencias.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }
        
    

    @Override
    public void editar(Agencia objeto) throws Exception {
       try {
            if(!infoAgencias.containsKey(objeto.getNombre())){
                throw new Exception("El objeto no esta registrado");
            }
            infoAgencias.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoAgencias.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoAgencias.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

        
    

    @Override
    public List<Agencia> listarTodo() throws Exception {
        List<Agencia> agencias = new ArrayList<>();
        
        try {
            
            if(infoAgencias.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Agencia> indentificacion : infoAgencias.entrySet()){
            
            String norma = indentificacion.getKey();
               
            Agencia agencia = indentificacion.getValue(); 
            
            agencias.add(agencia);
            }
            return agencias;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
       List<Agencia> NumeroAgen = listarTodo();
       
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

     
}
