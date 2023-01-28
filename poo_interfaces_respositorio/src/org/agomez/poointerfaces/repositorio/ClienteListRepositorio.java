package org.agomez.poointerfaces.repositorio;

import org.agomez.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio{
    // Esto sería una implementación DTO
    private List<Cliente> dataSource;
    public ClienteListRepositorio(){
        this.dataSource = new ArrayList<>();
    }


    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for(Cliente cli : dataSource) {
            if(cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        // Cliente cli = this.porId(id);
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {

        if(dir.equals(Direccion.ASC)) {
            if(campo.equals("apellido")) {
                dataSource.sort(Comparator.comparing(Cliente::getApellido));
            }
            else if(campo.equals("nombre")) {
                dataSource.sort(Comparator.comparing(Cliente::getNombre));
            }
            else {
                dataSource.sort(Comparator.comparing(Cliente::getId));
            }
        }
        else {
            if(campo.equals("apellido")) {
                dataSource.sort(Comparator.comparing(Cliente::getApellido).reversed());
            }
            else if(campo.equals("nombre")) {
                dataSource.sort(Comparator.comparing(Cliente::getNombre).reversed());
            }
            else {
                dataSource.sort(Comparator.comparing(Cliente::getId).reversed());
            }
        }
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
