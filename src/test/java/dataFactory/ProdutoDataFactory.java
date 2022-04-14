package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComOValorIgualA(double valor){

        ProdutoPojo produto = new ProdutoPojo();

        produto.setProdutoNome("Playstation 5");

        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
            cores.add("preto");
            cores.add("banco");

        produto.setProdutoCores(cores);

        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();
            ComponentePojo componente = new ComponentePojo();
                componente.setComponenteNome("Controle");
                componente.setComponenteQuantidade(1);
            componentes.add(componente);

            ComponentePojo segundoComponente = new ComponentePojo();
                segundoComponente.setComponenteNome("Memory Card");
                segundoComponente.setComponenteQuantidade(2);
            componentes.add(segundoComponente);

        produto.setComponentes(componentes);

    return produto;
    }
}
