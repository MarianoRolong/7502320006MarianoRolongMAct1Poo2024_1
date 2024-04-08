/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Candidato;
import model.InterfazCrud;

/**
 *
 * @author maria
 */
public class CandidatoCrud implements InterfazCrud<Candidato> {
    
private HashMap<String, Candidato> infoCandidatos;
    @Override
    public void agregar(Candidato objeto) 
        throws Exception {
        try {
            if(infoCandidatos.containsKey(objeto.getFotografia())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoCandidatos.put(objeto.getFotografia(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }

    @Override
    public Candidato buscar(Candidato codigo) throws Exception {
        
        try {
            if(! infoCandidatos.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoCandidatos.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(Candidato objeto) throws Exception {
       try {
            if(!infoCandidatos.containsKey(objeto.getFotografia())){
                throw new Exception("El objeto no esta registrado");
            }
            infoCandidatos.put(objeto.getFotografia(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoCandidatos.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoCandidatos.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public List<Candidato> listarTodo() throws Exception {
        List<Candidato> candidatos = new ArrayList<>();
        
        try {
            
            if(infoCandidatos.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Candidato> indentificacion : infoCandidatos.entrySet()){
            
            String xyz = indentificacion.getKey();
               
            Candidato candidato = indentificacion.getValue(); 
            
            candidatos.add(candidato);
            }
            return candidatos;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public int contar() throws Exception {
       List<Candidato> NumeroCandidato = listarTodo();
       
       int NumeroCandidatos = 0;
       
        try {
            NumeroCandidatos = NumeroCandidato.size();
            if(NumeroCandidatos == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroCandidatos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}



  

    
   
    

