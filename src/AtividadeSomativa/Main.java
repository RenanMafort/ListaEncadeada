package AtividadeSomativa;

public class Main {
    public static void main(String[] args) {


        Lista lista = new Lista();
        lista.inserirInicio(10);
        lista.inserirInicio(20);
        lista.inserirInicio(30);
        lista.inserirInicio(40);
        lista.mostrarLista();

        lista.inserirNoFinal(50);
        lista.mostrarLista();

        lista.inserirPorIndice(2,60);
        lista.mostrarLista();

        lista.removePrimeiro();
        lista.mostrarLista();

        lista.retirarFim();
        lista.mostrarLista();

        lista.removePorIndice(2);
        lista.mostrarLista();


        lista.vazia();

    }
}
