
package ejemplodate;

import java.time.LocalDate;

public class TrabajadorDate{
    String nombre;
    LocalDate fecha_alta;

    public TrabajadorDate(){

    }

    public TrabajadorDate(String nombre, LocalDate alta){
        this.nombre=nombre;
        this.fecha_alta=alta;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public LocalDate getFecha_alta(){
        return fecha_alta;
    }

    public void setFecha_alta(LocalDate fecha_alta){
        this.fecha_alta=fecha_alta;
    }

    @Override
    public String toString(){
        return "TrabajadorDate{"+"nombre="+nombre+", fecha_alta="+fecha_alta+'}';
    }
    
    
}
