package trabalhoP2;

public interface ColecaoDePersonalidades 
{
    public boolean adicionarPersonalidade(Personalidade personalidade);

    public boolean excluirPersonalidade(String nomeDaPersonalidade);

    public Personalidade obterPersonalidade(int posicaoDaPersonalidade);

    public int obterTotalDePersonalidades();

    public boolean trocarPosicaoEntrePersonalidades(int posicaoDaPersonalidade1, int posicaoDaPersonalidade2);

    public boolean alterarPersonalidade(int posicaoDaPersonalidade, Personalidade novaPersonalidade);

    public void ordenarPersonalidades(Ordenador ordenador);
}
