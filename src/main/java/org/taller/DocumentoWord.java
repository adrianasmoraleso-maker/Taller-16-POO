package org.taller;

// DocumentoWord — extensión sin modificar la clase base
public class DocumentoWord extends Documento {
    @Override
    public void exportar() {
        System.out.println("Exportando documento a Word...");
    }
}