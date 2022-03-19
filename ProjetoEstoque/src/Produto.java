public class Produto {
    public int produto;
    public String descricao;
    public long quantidade;
    public long nivel;
    public double valor;

    public boolean entrada (long l){
        if (l > 0){ quantidade += l;
            return true;
        }
            return false;
    }
    public boolean saida (long l){
        if (l > 0 && l <= quantidade){ quantidade-= l;
            return true;
        }
            return false;
    }
    public void imprimir(){
        System.out.println("Produto: " +produto);
        System.out.println("Descrição: " +descricao);
        System.out.println("Quantidade: " +quantidade);
        System.out.println("Nível: " +nivel);
        System.out.println("Valor: " +valor);
    }

    public void checarNivel(){
        if (nivel > quantidade)
            System.out.println("Quantidade está abaixo do Nível esperado");
        else
            System.out.println("Quantidade está ok com o Nível");
    }

}
