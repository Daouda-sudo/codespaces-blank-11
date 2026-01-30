public class Liste {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Liste() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }
    public int getSize() {
        return size;
    }
    public Nodo getHead() {
        return head;
    }
    public Nodo getCursor() {
        return cursor;
    }
    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }
    
     public void aggiungiElementoInOrdine(Nodo nodo) {

 
    if (head == null) {
        head = nodo;           
        size++;
        return;
    }

    
    if (nodo.getValore() < head.getValore()) {
        nodo.setNext(head);    
        head = nodo;           
        size++;
        return;
    }

    
    Nodo corrente = head;

    while (corrente.getNext() != null &&
           corrente.getNext().getValore() < nodo.getValore()) {
        corrente = corrente.getNext();
    }

    nodo.setNext(corrente.getNext());
    corrente.setNext(nodo);
    size++;
}


    public static void stampa(Liste lista) {
        Nodo corrente = lista.getHead();

        System.out.print("[");

        while (corrente != null) {
            System.out.print(corrente.getValore());

            if (corrente.getNext() != null) {
                System.out.print(", ");
            }

            corrente = corrente.getNext();
        }

        System.out.println("]");
    }
}
