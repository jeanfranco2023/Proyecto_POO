package clases;

import java.util.ArrayList;

public class controlador {

    private ArrayList<vendedor> listavendedor;
    

    public controlador() { 

    }
    public vendedor buscarusuario(String usuario) {
        for (int i = 0; i < listavendedor.size(); i++) {
            vendedor usuarios = listavendedor.get(i);
            if (usuario != null) {
                return usuarios;
            }
        }
        return null;
    }

    public boolean agregarpersona(vendedor vendedor) {
        vendedor aux = buscarusuario(vendedor.getUsuario().toString());
        if (aux == null) {
            listavendedor.add(vendedor);
            return true;
        }
        return false;
    }
}
