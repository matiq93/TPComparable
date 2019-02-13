/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcomparable;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class Estudiante implements Comparable<Estudiante>{
    private String noUnico, nombre;
    private Calendar fechaNacimiento;
    private double ira;

    public Estudiante(String noUnico, String nombre, Calendar fechaNacimiento, double ira) {
        this.noUnico = noUnico;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ira = ira;
    }

    public Estudiante() {
        this.noUnico = null;
        this.nombre = null;
        this.fechaNacimiento = null;
        this.ira = 0.0;
    }

    public String getNoUnico() {
        return noUnico;
    }

    public void setNoUnico(String noUnico) {
        this.noUnico = noUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }
    
    public int ObtenerEdad(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(this.getFechaNacimiento().getTime());
        String anio = fecha.substring(6, 10);
        return 2019-Integer.parseInt(anio);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        return String.format("No. Unico: %s \tNombre: %20s \t Fecha de Nacimiento: %s \t IRA: %.2f \tEdad: %s", this.noUnico,this.nombre,sdf.format(this.fechaNacimiento.getTime()),this.ira , this.ObtenerEdad());
    }

    @Override
    public int compareTo(Estudiante aux) {
        return this.ObtenerEdad()-aux.ObtenerEdad();
       // return this.getNombre().compareTo(aux.getNombre());
    }
    
    
    
}