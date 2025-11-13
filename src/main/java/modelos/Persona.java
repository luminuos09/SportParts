
package modelos;


public abstract class Persona {
    private int edad;
    private String nombre;
     private long cedula;
    private String correo;

    
    public Persona() {
    }

    public Persona(int edad, String nombre, long cedula, String correo) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
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
    
   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+
                "Edad: "+getEdad()+"Cedula: "+getCedula()+
                "Correo: "+getCorreo();
    }

    
    
    
}
