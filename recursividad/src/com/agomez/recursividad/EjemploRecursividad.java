package com.agomez.recursividad;

import com.agomez.recursividad.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC");
        Componente poder = new Componente("Fuente de poder");
        Componente placaMadre = new Componente("Motherboard Asus");
        Componente cpu = new Componente("Procesador Intel Core I5");
        Componente ventiladorCpu = new Componente("Ventilador de CPU");
        Componente dicipadorCpu = new Componente("Dicipador de CPU");
        Componente tarjetaVideo = new Componente("Nvidia RTX 3080 GTX");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam1 = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente ventiladorGpu = new Componente("Ventilador de tarjeta de video");
        Componente ssd = new Componente("Disco duro SSD 2TB");
        Componente memoriaRam = new Componente("16GB Ram");

        cpu.addComponente(ventiladorCpu)
                .addComponente(dicipadorCpu);
        tarjetaVideo.addComponente(gpu)
                .addComponente(gpuRam1)
                .addComponente(gpuRam2)
                .addComponente(ventiladorGpu);
        placaMadre.addComponente(cpu)
                .addComponente(memoriaRam)
                .addComponente(tarjetaVideo)
                .addComponente(ssd)
                .addComponente(memoriaRam);
        pc.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Raton"))
                .addComponente(new Componente("Monitor"));

        //metodoRecursivo(pc, 0);
        metodoRecursivoStream(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));
    }

    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if(c.tieneHijos()){
            for(Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }

    public static Stream<Componente> metodoRecursivoStream(Componente c, int nivel) {
        c.setNivel(nivel);

        return Stream.concat(Stream.of(c),
                c.getHijos()
                        .stream()
                        .flatMap(hijo -> metodoRecursivoStream(hijo, nivel + 1))
        );

    }
}
