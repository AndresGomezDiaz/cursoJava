package com.agomez.patrones.decorator;

import com.agomez.patrones.decorator.decorador.MayusculaDecorador;
import com.agomez.patrones.decorator.decorador.ReemplazarEspaciosDecorador;
import com.agomez.patrones.decorator.decorador.ReversaDecorador;
import com.agomez.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andrés!");
        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        System.out.println("Mayus: " + mayuscula.darFormato());
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        System.out.println("Reversa: " + reversa.darFormato());
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);
        System.out.println("Subrayado: " + subrayado.darFormato());
        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(texto);
        System.out.println("Reemplazar: " + reemplazar.darFormato());
    }
}
