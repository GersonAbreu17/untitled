public class Fila <T>{
    private class NoFila{
        private NoFila prox;
        private T info;

        public NoFila(T info) {
            this.info = info;
            this.prox = null;
        }

        public NoFila getProx() {
            return prox;
        }

        public void setProx(NoFila prox) {
            this.prox = prox;
        }

        public T getInfo() {
            return info;
        }

        public void setInfo(T info) {
            this.info = info;
        }
    }

    private NoFila inicio;
    private NoFila fim;

    public Fila(){
        inicio = null;
        fim = null;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public void enqueue(T info){
        NoFila novo = new NoFila(info);
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            fim.setProx(novo);
            fim = novo;
        }
    }

    public T dequeue(){
        T aux = inicio.getInfo();
        inicio = inicio.getProx();
        return aux;
    }

    public T first(){
        return inicio.getInfo();
    }
}