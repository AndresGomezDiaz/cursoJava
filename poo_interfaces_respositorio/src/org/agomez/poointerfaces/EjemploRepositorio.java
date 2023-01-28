package org.agomez.poointerfaces;

import org.agomez.poointerfaces.modelo.Cliente;
import org.agomez.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        // Esta sería una implementación del DAO
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Andres", "Gomez"));
        repo.crear(new Cliente("Oscar", "Urrutia"));
        repo.crear(new Cliente("Miguel", "Naranjo"));

        List<Cliente> clientes = repo.listar("nombre", Direccion.ASC);
        clientes.forEach(System.out::println);
        System.out.println("\nPaginable: ");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(0,3);
        paginable.forEach(System.out::println);

        System.out.println("\nOrdenable: ");
        List<Cliente> ordenable = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DESC);
        ordenable.forEach(System.out::println);
    }
}
