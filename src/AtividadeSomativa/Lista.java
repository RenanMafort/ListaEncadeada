package AtividadeSomativa;

public class Lista {
    No inicio;
    int tamanho = 0;

    public void inserirInicio(int info) {
        No no = new No();
        no.setInfo(info); ;
        no.setProximo(inicio);
        inicio = no;
        tamanho++;
    }

    No removePrimeiro() {
        if (inicio == null) {
            return null;
        }
        int info = inicio.getInfo();
        inicio = inicio.getProximo();
        tamanho--;
        return inicio;
    }

    public void inserirNoFinal(int info) {
        No no = new No();
        no.setInfo(info);
        if (inicio == null) {
            no.setProximo(null);
            inicio = no;
        } else {
            No local = inicio;
            while (local.getProximo() != null) {
                local = local.getProximo();
            }
            local.setProximo(no);
            no.setProximo(null);
        }
        tamanho++;
    }

    public Integer retirarFim() {
        if (inicio == null) {
            return null;
        }
        No local = inicio;
        while (local.getProximo() != null) {
            No aux = local;
            local = local.getProximo();
            if (local.getProximo() == null) {
                aux.setProximo(null);
                tamanho--;
                return local.getInfo();
            }
        }
        inicio = null;
        tamanho--;
        return local.getInfo();
    }

    public void inserirPorIndice(int indice, Integer number) {
        if (indice<=0){
            inserirInicio(number);
        }else if (indice>=tamanho){
            inserirNoFinal(number);
        }else {
            No local = inicio;
            for (int i = 0; i<indice-1 ; i++) {
                local=local.getProximo();
                No no = new No();
                no.setInfo(number);
                no.setProximo(local.getProximo());
                local.setProximo(no);
                tamanho++;
            }
        }
    }
    public void removePorIndice(int indice){
        if (indice <0 || indice>= tamanho || inicio==null){
            System.out.println("Lista Vazia !!!");
        }else if (indice==0){
            removePrimeiro();
        }else if (indice ==tamanho - 1){
           retirarFim();
        }
        No local = inicio;
        for (int i = 0; i < indice-1 ; i++) {
            local = local.getProximo();
        }
        No info = local.getProximo().getProximo();
        local.setProximo(local.getProximo().getProximo());
        tamanho--;

    }

    public void mostrarLista() {
        System.out.println();
        No local = inicio;
        while (local != null) {
            System.out.print(local.getInfo() + ", ");
            local = local.getProximo();
        }
    }

    boolean vazia(){
        if (inicio==null){
            System.out.println("\nLista vazia !!!!".toUpperCase());
        }else {
            System.out.println("\nLista contém objetos !!!!".toUpperCase());
        }
        return true;
    }


}
