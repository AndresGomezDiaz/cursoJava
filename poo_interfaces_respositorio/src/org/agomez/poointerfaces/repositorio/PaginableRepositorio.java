package org.agomez.poointerfaces.repositorio;

import org.agomez.poointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
