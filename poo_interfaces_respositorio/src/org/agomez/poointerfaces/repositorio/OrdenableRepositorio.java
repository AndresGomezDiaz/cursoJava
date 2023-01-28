package org.agomez.poointerfaces.repositorio;

import org.agomez.poointerfaces.modelo.Cliente;
import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
