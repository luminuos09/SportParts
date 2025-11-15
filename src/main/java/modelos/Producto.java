
package modelos;


public abstract class Producto {
    private String nombre;
    private int cantidad;
    private int id;
    private String talla;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, int id, String talla, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.id = id;
        this.talla = talla;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()
                +"\nCantidad: "+getCantidad()
                +"\nId: "+getId()
                +"\nTalla: "+getTalla()+
                "\nPrecio: "+getPrecio();
                
    }
    
   
    
    
}
