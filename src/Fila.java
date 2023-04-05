public class Fila {
        private static Fila fila;

    private Fila(){
    }
    public void imprimeDocumento(){
            }
     public void removeDocumento(){
     }
     public void removeTodosDocumentos(){
     }
     public static Fila getInstance(){
        if (fila==null){
            fila = new Fila();
        }
        return fila;
     }
}
