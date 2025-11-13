
package modelos;


public class Usuario extends Persona {
    private long cedula;
    private String correo;
    private long compras;
    public Usuario() {
    }
    
    

    public Usuario(long cedula, String correo, long compras, int edad, String nombre) {
        super(edad, nombre);
        this.cedula = cedula;
        this.correo = correo;
        this.compras = compras;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCompras() {
        return compras;
    }

    public void setCompras(long compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cedula: "+getCedula()+
                "Correo: "+getCorreo()+
                "Compras: "+getCompras();
        
    }

    
    
    
}
