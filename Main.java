public class Main {
    public static void main(String[] args) {

        Liste lista = new Liste();

        lista.aggiungiElementoInOrdine(new Nodo(3));
        lista.aggiungiElementoInOrdine(new Nodo(1));
        lista.aggiungiElementoInOrdine(new Nodo(2));
        lista.aggiungiElementoInOrdine(new Nodo(5));
        lista.aggiungiElementoInOrdine(new Nodo(4));

        stampa(lista);
    }