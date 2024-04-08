/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author maria
 */
public interface InterfazCrud<Clase> {
    
    public void agregar(Clase objeto) throws Exception;
    
    public Clase buscar(Clase codigo)throws Exception;
    
    public void editar(Clase objeto)throws Exception;
    
    public void eliminar(String codigo)throws Exception;
    
    public List<Clase> listarTodo()throws Exception;
    
    public int contar()throws Exception;
}
