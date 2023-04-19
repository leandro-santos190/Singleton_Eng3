public class Fila {
        private static Fila fila;
        private static int cont;

    private Fila(){
    }
    public void imprimeDocumento(){
            }
     public void removeDocumento(){
     }
     public void removeTodosDocumentos(){
     }
     public static Fila getInstanciaFila(){
    	 
    	 if (fila==null && cont==0){
            fila = new Fila();
        }
    	 cont++;
        return fila;
     }
     
     public String retornaMsg() {
    	 if(cont>1) {
    		 return "Foram instaciados "+cont+" objetos para a "+getClass()+". Só pode ser criado um único objeto para esta classe!";
    	 }else {
    		 return "OK!";
    	 }
     }
     
}
