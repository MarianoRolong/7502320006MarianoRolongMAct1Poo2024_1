/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.CandidatoNino;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class CandidatoNinoCrud implements InterfazCrud<CandidatoNino> {
private HashMap<String, CandidatoNino> infoCandidatosNinos;

    @Override
    public void agregar(CandidatoNino objeto) throws Exception {
        try {
            if(infoCandidatosNinos.containsKey(objeto.getNombreTutor())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoCandidatosNinos.put(objeto.getNombreTutor(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public CandidatoNino buscar(CandidatoNino codigo) throws Exception {
        
        try {
            if(!infoCandidatosNinos.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoCandidatosNinos.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(CandidatoNino objeto) throws Exception {
       try {
            if(!infoCandidatosNinos.containsKey(objeto.getNombreTutor())){
                throw new Exception("El objeto no esta registrado");
            }
            infoCandidatosNinos.put(objeto.getNombreTutor(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoCandidatosNinos.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoCandidatosNinos.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }



    @Override
    public List<CandidatoNino> listarTodo() throws Exception {
        List<CandidatoNino> cansdidatosNinos = new ArrayList<>();
        
        try {
            
            if(infoCandidatosNinos.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, CandidatoNino> indentificacion : infoCandidatosNinos.entrySet()){
            
            String lpo = indentificacion.getKey();
               
            CandidatoNino candidatoNino = indentificacion.getValue(); 
            
            cansdidatosNinos.add(candidatoNino);
            }
            return cansdidatosNinos;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    

    @Override
    public int contar() throws Exception {
       List<CandidatoNino> NumeroCandidatoNino = listarTodo();
       
       int NumeroCandidatosNinos = 0;
       
        try {
            NumeroCandidatosNinos = NumeroCandidatoNino.size();
            if(NumeroCandidatosNinos == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroCandidatosNinos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}


   

