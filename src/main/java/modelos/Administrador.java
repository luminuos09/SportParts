
package modelos;


public class Administrador extends Persona {
    private String contraseña;
    private String usuario;

    public Administrador() {
    }

    public Administrador(String contraseña, String usuario, int edad, String nombre, long cedula, String correo) {
        super(edad, nombre, cedula, correo);
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    
    
    
    

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    
  
    
    
    
}
