
package modelos;


public  class Usuario extends Persona {
    private long compras;
    public Usuario() {
    }

    public Usuario(long compras, int edad, String nombre, long cedula, String correo) {
        super(edad, nombre, cedula, correo);
        this.compras = compras;
    }

    public long getCompras() {
        return compras;
    }

    public void setCompras(long compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return super.toString()+ 
                "\nCompras: "+getCompras();
        
    }

    
    
    
}
