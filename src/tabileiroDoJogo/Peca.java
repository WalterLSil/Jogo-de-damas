package tabileiroDoJogo;

public abstract class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.posicao = null;
        this.tabuleiro = tabuleiro;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }


    public abstract Peca[][] movimentosPossiveis();

    public boolean movimentosPossivel(Posicao posicao){

    }
    public boolean ePossivelDeMover(){

    }
}
