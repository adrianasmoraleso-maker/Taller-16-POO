package org.taller;

public class PruebaDocumento {
    public static void main(String[] args) {

        System.out.println("\n============= Gestión de documentos con diferentes formatos =============\n");

        Documento[] docs = {
                new DocumentoPDF(),
                new DocumentoWord(),
                new DocumentoExcel()
        };

        for (Documento doc : docs) {
            doc.exportar();
        }
    }
}