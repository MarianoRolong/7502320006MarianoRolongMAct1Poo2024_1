/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import marianorolong.base.Cliente;
import model.InterfazCrud;



/**
 *
 * @author maria
 */
public class ClienteCrud implements InterfazCrud<Cliente>{

    private HashMap<String, Cliente> infoClientes;
    
    @Override
    public void agregar(Cliente objeto) throws Exception {
        try {
            if(infoClientes.containsKey(objeto.getNombre())){
                throw new Exception("El objeto ya esta registrado");
            }
            infoClientes.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public Cliente buscar(Cliente codigo) throws Exception {
        
        try {
            if(!infoClientes.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            return infoClientes.get(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }


    @Override
    public void editar(Cliente objeto) throws Exception {
       try {
            if(!infoClientes.containsKey(objeto.getNombre())){
                throw new Exception("El objeto no esta registrado");
            }
            infoClientes.put(objeto.getNombre(), objeto);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public void eliminar(String codigo) throws Exception {
        
        try {
            if(!infoClientes.containsKey(codigo)){
                throw new Exception("El objeto no existe");
            }
            
            infoClientes.remove(codigo);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
    }


    @Override
    public List<Cliente> listarTodo() throws Exception {
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            
            if(infoClientes.isEmpty()){
                
            throw new Exception("No existen elementos en la lista");
                
            }
            for(Map.Entry<String, Cliente> indentificacion : infoClientes.entrySet()){
            
            String norma = indentificacion.getKey();
               
            Cliente cliente = indentificacion.getValue(); 
            
           clientes.add(cliente);
            }
            return clientes;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public int contar() throws Exception {
       List<Cliente> NumeroCliente = listarTodo();
       
       int NumeroClientes = 0;
       
        try {
            NumeroClientes = NumeroCliente.size();
            if(NumeroClientes == 0){
                
            throw new Exception("no tiene elementos");
            }
                return NumeroClientes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

     
}

