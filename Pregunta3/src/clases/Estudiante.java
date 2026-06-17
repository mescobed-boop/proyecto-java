package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cielo
 */
public class Estudiante {
    private int codigo;
    private String nombres;
    private int categoria;
    private String carrera;

    public Estudiante(int codigo, String nombres, int categoria, String carrera) {
        this.codigo = codigo; // validacion
        this.nombres = nombres;
        this.categoria = categoria; // categoria
        this.carrera = carrera;
        
    }

    public Estudiante(int codigo, String nombres) {
        this(codigo,nombres,2,"Ingenieria de Sistemas");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo>0)
        {
            this.codigo =codigo;
        }
        else
        {
            System.out.println("Error mayor que cero");
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        if (categoria>=1 && categoria<=3)
        {
            this.categoria =categoria;
        }
        else
        {
            System.out.println("Error la categoria debe estar entre 1 y 3");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    // metodo de negocio
    
    public double ObtenerDescuento()
    {
        switch(categoria)
        {
            case 1:
                return 0.20;
            case 2:
                return 0.10;
            case 3:
                return 0.05;
            default:
                return 0.0;
        }
    }        
    
    
    
    
}
