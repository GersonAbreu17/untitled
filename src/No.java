public class No {

    private String palavra;
    private No[] vLig;
    private boolean fim;
    public static int qtdL = 26;

    public No(String palavra, boolean fim) {
        this.palavra = palavra;
        this.vLig = new No[No.qtdL];
        this.fim = fim;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public No getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(int pos, No no) {
        this.vLig[pos] = no;
    }

    public boolean isFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }



}
