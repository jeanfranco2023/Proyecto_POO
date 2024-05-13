
package clases;

public class cliente {
   String nombre;
   int DNI;
   int telefono;

    public cliente(String nombre, int DNI, int telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   
}
