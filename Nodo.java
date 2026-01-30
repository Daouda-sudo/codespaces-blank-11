  public class Nodo {

        private int valore;
        private Nodo next;

        public Nodo(int valore){
            this.valore = valore;
            this.next = null;
        }

        public int getValore() {
            return valore;
        }
        public void setValore(int valore) {
            this.valore = valore;
        }
        public Nodo getNext() {
            return next;
        }
        public void setNext(Nodo next) {
            this.next = next;
        }

    }