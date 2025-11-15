
package modelos;


public class Conjuntos extends Producto{
    
    
    private String marca;
    private String color;

    public Conjuntos() {
    }

    public Conjuntos(String marca, String color, String nombre, int cantidad, int id, String talla, double precio) {
        super(nombre, cantidad, id, talla, precio);
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Marca: "+getMarca()+
                "\n Color: "+getColor();
    }
    
    
    
}
