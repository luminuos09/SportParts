
package modelos;


public class Camisetas extends Producto{
    private String temporada;
    private String equipacion;

    public Camisetas() {
    }

    public Camisetas(String temporada, String equipacion, String nombre, int cantidad, int id, String talla, double precio) {
        super(nombre, cantidad, id, talla, precio);
        this.temporada = temporada;
        this.equipacion = equipacion;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getEquipacion() {
        return equipacion;
    }

    public void setEquipacion(String equipacion) {
        this.equipacion = equipacion;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Temporada: "+getTemporada()+
                "\n Equipacion: "+getEquipacion(); 
    }
    
    
    
}
