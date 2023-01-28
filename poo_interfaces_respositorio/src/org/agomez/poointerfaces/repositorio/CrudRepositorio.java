package org.agomez.poointerfaces.repositorio;

import org.agomez.poointerfaces.modelo.Cliente;
import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar(String nombre, Direccion asc);
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
