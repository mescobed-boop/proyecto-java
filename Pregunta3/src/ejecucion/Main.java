/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecucion;

import clases.Estudiante;
import clases.Matricula;

/**
 *
 * @author cielo
 */
public class Main {
    public static void main(String[] args) {
        Estudiante e1 =new Estudiante(1001,"Juan Perez",1,"Ingenieria Industrial");
        Estudiante e2 = new Estudiante (1002,"Maria Lopez");
        
        Matricula m1 =new Matricula(1,e1,18,350.0);
        Matricula m2 =new Matricula(2,e2,20,350.0);
        Matricula m3 =new Matricula(3,e1,15,350.0);
        
        m1.obtenerDetalle();
        m2.obtenerDetalle();
        m3.obtenerDetalle();
        
    }
}
