
public class Main {

    public static void main(String[] args) {
        Trie arv = new Trie();
        String[] lista = new String[] {"banana", "java","carro","livro","floresta","cachorro","computador","musica","escola","programador","internet","amarelo","mar","cidade","bicicleta","luz","arvore","estrada","nuvem","montanha","gato","sol","estrela","caneta","papel","felicidade","viagem","trabalho","futebol","historia","oceano","universo","tecnologia","relogio","jardim","biblioteca","amigo","lua","mapa","agua","foguete","planeta","cafe","tigre","quadro","poesia","cinema","vulcao","avenida","livraria","galaxia","teatro","circo","serpente","camisa","chave","martelo","camera","jornal","bolsa","rio","campo","futuro","saude","amor","esperanca","montanha","mochila","supermercado","trator","cultura","pintura","escultura","vinho","deserto","estrangeiro","estudante","filosofia","flamingo","tartaruga","jornalista","elefante","violao","museu","cidade","praia","corredor","aviao","telefone","carteira","farmacia","cadeado","cidade","velocidade","identidade","aventura","flor","hotel","energia","fantasia","chuva","neve","primavera","verao","outono","inverno","danca","jogo","invencao","musica","poema","comida","gelo","nuvem","parque","bicicleta","cadeira","almoco","aventura","brinquedo","boneco","professor","universidade","ciencia","misterio"};
        // String[] lista = new String[] {"floresta","flamingo", "filosofo", "flor", "gerson", "gelo", "gabriel", "geraldo", "sol", "soldado"};
        for(String palavra : lista){
            arv.inserir(palavra);
        }
        System.out.println("\n\n*** Nos por nivel ***\n");
        arv.exibirBonito();
        System.out.println("\n\n*** Todas as palavras ***\n");
        arv.exibir();
    }
}
