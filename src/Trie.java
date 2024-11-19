

public class Trie{
    private No raiz;
    
    public Trie(){
        raiz = new No("", false);
    }

    public void inserir(String palavra){
        int i;
        String strAux;
        boolean inserido = false;
        int pos = palavra.charAt(0) - 'a';
        No ant = raiz;
        No no = raiz.getvLig(pos);
        No noDeCima;
        while(!inserido)
        {
            if(no == null)
            {
                ant.setvLig(pos, new No(palavra, true));
                inserido = true;
            }
            else if(palavra.equals(no.getPalavra())){
                no.setFim(true);
                inserido = true;
            }
            else if(palavra.startsWith(no.getPalavra())){
                palavra = palavra.substring(no.getPalavra().length());
                pos = palavra.charAt(0) - 'a';
                ant = no;
                no = no.getvLig(pos);
            }
            else{
                i = 0;
                while(i < palavra.length() && palavra.charAt(i) == no.getPalavra().charAt(i))
                    i++;
                
                noDeCima = new No(palavra.substring(0, i), false);
                ant.setvLig(pos, noDeCima);
                no.setPalavra(no.getPalavra().substring(i));
                pos = no.getPalavra().charAt(0) - 'a';
                noDeCima.setvLig(pos, no);
                no = noDeCima;
                pos = palavra.charAt(0) - 'a';
            }
        }
    }

    public void exibirNos(){
        Fila<No> nos = new Fila<>();
        Fila<Integer> niveis = new Fila<>();
        nos.enqueue(raiz);
        niveis.enqueue(0);
        while(!nos.isEmpty())
        {
            System.out.printf("%d: %s\n", niveis.first(), nos.first().getPalavra());

            for(int i=0;i<No.qtdL;i++)
                if(nos.first().getvLig(i) != null)
                {
                    nos.enqueue(nos.first().getvLig(i));
                    niveis.enqueue(niveis.first() + 1);
                }

            nos.dequeue();
            niveis.dequeue();
        }
    }

    public void exibir(){
        exibir_rec("", raiz);
    }

    private void exibir_rec(String palavra, No no){
        if(no.isFim())
            System.out.println("    "+palavra);

        for(int i=0;i < No.qtdL; i++)
            if(no.getvLig(i) != null)
                exibir_rec(palavra + no.getvLig(i).getPalavra(), no.getvLig(i));
    }

    public void exibirBonito(){
        exibirBonito_rec(raiz, 0);
    }

    private void exibirBonito_rec(No no, int nivel){
        for(int i=0;i<nivel;i++)
            System.out.printf("    ");

        if(no.isFim())
            System.out.printf("%s.\n",no.getPalavra());
        else
            System.out.printf("%s\n",no.getPalavra());

        for(int i=0;i< No.qtdL;i++)
            if(no.getvLig(i) != null)
                exibirBonito_rec(no.getvLig(i), nivel + 1);
    }
}