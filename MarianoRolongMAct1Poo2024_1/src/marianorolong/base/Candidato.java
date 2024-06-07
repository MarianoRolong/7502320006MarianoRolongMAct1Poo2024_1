/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author maria
 */
public class Candidato {
    //PROPIEDADES
    public int id;
    public String codigo;
    public Date fechaNacimiento; 
    public String fotografia;
    public String provincia;
    public String sexo; 
    public String altura; 
    public int edad; 
    public String colorPelo; 
    public String colorOjos;
    public String especialidad;
    public String experiencia;
    public Casting casting;
    public Prueba prueba;
    public static HashMap<String, Candidato> candidatosBD;
    
//CONSTRUCTORES
    public Candidato (){
    
    }

    public Candidato(String codigo, Date fechaNacimiento, String fotografia, String provincia, String sexo, Float altura, int edad, String colorPelo, String colorOjos, String especialidad, Experiencia experiencias, Casting casting, Prueba prueba) {
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
        this.provincia = provincia;
        this.sexo = sexo;
        //this.altura = altura;
        this.edad = edad;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
        this.especialidad = especialidad;
        //this.experiencias.add(experiencias);
        this.casting = casting;
        this.prueba = prueba;
    }

    public String getCodigo() {
        return codigo;
    }
      public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFotografia() {
        return fotografia;
    }
     public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getProvincia() {
        return provincia;
    }
     public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSexo() {
        return sexo;
    }
     public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

   

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getColorOjos() {
        return colorOjos;
    }
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public Casting getCasting() {
        return casting;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    @Override
    public String toString() {
        return "Candidato{" + "\n Codigo: " + codigo + ", \n FechaNacimiento: " + fechaNacimiento + ", \n Fotografia:" + fotografia + ", \n Provincia: " + provincia + ", \n Sexo:" + sexo + ", \n Altura: " + altura + ", \n Edad: " + edad + ", \n ColorPelo: " + colorPelo + ", \n ColorOjos: " + colorOjos + ", \n Especialidad: " + especialidad + '}';
    }

  
}
