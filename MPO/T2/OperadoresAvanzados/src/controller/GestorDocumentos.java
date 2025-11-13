package controller;

import database.GestionConexion;

public class GestorDocumentos {

    public static void ejecutarDocumento(){
        System.out.println("Ejecutando");
    }

    public void imprimirFactura(int cantidad){
        GestionConexion gestionConexion = new GestionConexion();
        gestionConexion.abrirConexion();

    }

    public void enviarDocumento(String tituloDocumento, String correo){

    }

    public void validadDocumento(String documento, int nPaginas){

    }
}
