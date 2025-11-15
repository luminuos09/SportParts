
package modelos;

//comentario de prueba
public class Empleado extends Persona{
    private String contraseña;
    private String usuario;

    public Empleado() {
    }

    public Empleado(String contraseña, String usuario, int edad, String nombre, long cedula, String correo) {
        super(edad, nombre, cedula, correo);
        this.contraseña = contraseña;
        this.usuario = usuario;
    }
    
   
    
}
