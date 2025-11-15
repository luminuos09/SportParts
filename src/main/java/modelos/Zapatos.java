/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author PC
 */
public class Zapatos extends Producto{
    private String marca;
    private String tipo;

    public Zapatos() {
    }

    public Zapatos(String marca, String tipo, String nombre, int cantidad, int id, String talla, double precio) {
        super(nombre, cantidad, id, talla, precio);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Marca: "+getMarca()+
                "\n Tipo: "+getTipo(); 
    }
    
    
    
    
}
