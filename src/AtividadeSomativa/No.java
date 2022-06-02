package AtividadeSomativa;

public class No {
      private int info;
     private No proximo;

     public void setInfo(int info){
          this.info=info;
     }

     public void setProximo(No proximo) {
          this.proximo = proximo;
     }

     public int getInfo(){
          return this.info;
     }

     public No getProximo() {
          return this.proximo;
     }
}
