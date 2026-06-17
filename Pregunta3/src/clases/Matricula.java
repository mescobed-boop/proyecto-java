/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author cielo
 */
public class Matricula {
    private int codigoMatricula;
    private Estudiante refEstudiante;
    private int creditosMatriculados;
    private double costoPorCredito;

    public Matricula(int codigoMatricula, Estudiante refEstudiante, int creditosMatriculados, double costoPorCredito) {
        this.codigoMatricula = codigoMatricula;
        this.refEstudiante = refEstudiante;
        this.creditosMatriculados = creditosMatriculados;
        this.costoPorCredito = costoPorCredito;
    }
    
    // metodos de negocio
    public double calcularMontoBruto()
    {
        return this.creditosMatriculados *this.costoPorCredito;
    }
    
    public double calcularDescuento()
    {
        return calcularMontoBruto()* refEstudiante.ObtenerDescuento();
    }
    public double calcularMontoFinal()
    {
        return calcularMontoBruto()-calcularDescuento();
        
    }
    public void obtenerDetalle()
    {
        System.out.println("===== Detalle de Matricula =====");
        System.out.println("Codigo de matricula   : " + codigoMatricula);
        System.out.println("Estudiante            : " + refEstudiante.getNombres());
        System.out.println("Codigo de estudiante   : " + refEstudiante.getCodigo());
        System.out.println("Carrera               : " + refEstudiante.getCarrera());
        System.out.println("Categoria              : " + refEstudiante.getCategoria());
        System.out.println("Creditos matriculados : " + creditosMatriculados);
        System.out.printf ("Costo por credito     : S/ %.2f%n", costoPorCredito);
        System.out.printf ("Monto bruto           : S/ %.2f%n", calcularMontoBruto());
        System.out.printf ("Descuento aplicado    : S/ %.2f%n", calcularDescuento());
        System.out.printf ("Monto final a pagar   : S/ %.2f%n", calcularMontoFinal());
        System.out.println("=================================");
    }
}
