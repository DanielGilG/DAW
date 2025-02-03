package Arquitectura.gestionLibros;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> lista = new ArrayList<>();

    public Biblioteca(){}

    public void addBookToLibrary(Publicacion publicacion){
        lista.add(publicacion);
    }

    public void showAvailableBooks(){
        System.out.printf("%n");
        System.out.println("====== Biblioteca =====");
        lista.forEach( (n) -> {
            if (n.isDisponible() == true)
                System.out.println(n);
        } );
        System.out.println("=======================");
        System.out.printf("%n");
    }

    public Publicacion searchBookByTitle(String titulo){
        System.out.printf("%n");
        System.out.println("===== Busqueda de Publicacion =====");
        for (Publicacion n : lista) {
           if (n.getTitulo().equals(titulo)){
               System.out.println(n);
               System.out.println("===================================");
               System.out.printf("%n");
               return n;
           }
        }
        System.out.println("============================");
        System.out.printf("%n");
        return null;
    }
}