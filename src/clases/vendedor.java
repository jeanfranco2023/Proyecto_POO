package clases;

import java.util.ArrayList;
import java.util.List;

public class vendedor extends boleta {

    protected String nombre_vendedor;
    protected int id_vendedor;
    protected int edad_vendedor;
    protected int DNI_vendedor;
    private String usuario;
    private String contraseña;
    protected String correo;

    public vendedor(String nombre_vendedor, int id_vendedor, int edad_vendedor, int DNI_vendedor, String usuario, String contraseña, int ruc, int id_venta, int id_producto, String nombre_producto, double precio, int cantidad, String marca) {
        super(ruc, id_venta, id_producto, nombre_producto, precio, cantidad, marca);
        this.nombre_vendedor = nombre_vendedor;
        this.id_vendedor = id_vendedor;
        this.edad_vendedor = edad_vendedor;
        this.DNI_vendedor = DNI_vendedor;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    protected String getNombre_vendedor() {
        return "Pedro Martinez";
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    protected int getId_vendedor() {
        return 11789685;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    protected int getEdad_vendedor() {
        return 35;
    }

    public void setEdad_vendedor(int edad_vendedor) {
        this.edad_vendedor = edad_vendedor;
    }

    private int getDNI_vendedor() {
        return 74859465;
    }

    public void setDNI_vendedor(int DNI_vendedor) {
        this.DNI_vendedor = DNI_vendedor;
    }

    public void atender_cliente() {

    }

    public List<String> getUsuario() {
        List<String> usuario = new ArrayList<>();
        usuario.add("jquispeza");
        usuario.add("gcorreaar");
        usuario.add("lbenavidesro");
        usuario.add("jriojaor");
        usuario.add("fnoroñame");
        //usuario.add(2, "gcorreaar");
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<String> getContraseña() {
        List<String> contraseña = new ArrayList<>();
        if (usuario.contains("jquispeza")) {
            contraseña.add("73602652");
        } else if (usuario.contains("gcorreaar")) {
            contraseña.add("75314862");
        } else if (usuario.contains("lbenavidesro")) {
            contraseña.add("73705161");
        } else if (usuario.contains("lbenavidesro")) {
            contraseña.add("75037790");
        }else if(usuario.contains("fnoroñame")){
        contraseña.add("73602651");
        }
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        switch (usuario) {
            case "jquispeza":
                correo = "U22311256@utp.edu.pe";
                break;
            case "gcorrear":
                correo = "U22302979@utp.edu.pe";
                break;
            case "lbenavidesro":
                correo = "U223113111@utp.edu.pe";
                break;
            case "jriojaor":
                correo = "U22237639@utp.edu.pe";
                break;
            case "fnoroñame":
                correo="U18103831@utp.edu.pe";
        }

        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void emitir_factura() {
        String cadena = "";
        cadena += "Nombre del trabajador: " + getNombre_vendedor() + "\n"
                + "ID del trabajador: " + getId_vendedor();
        generar_factura();

    }
}
