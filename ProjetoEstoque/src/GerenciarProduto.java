import java.util.Scanner;

public class GerenciarProduto {

   Produto produto = new Produto();
   Scanner scanner = new Scanner(System.in);


   public static void main(String[] args) {
      GerenciarProduto gp = new GerenciarProduto();

      int opt = 0;
      do {
         System.out.println("\n Menu Principal....");
         System.out.println("\n 1.Cadastrar Produto");
         System.out.println("\n 2.Registrar Entrada");
         System.out.println("\n 3.Registrar Saída");
         System.out.println("\n 4.Consultar");
         System.out.println("\n 5.Apresentar Nível");
         System.out.println("\n 6.Sair");
         opt = Integer.parseInt(gp.scanner.nextLine());
         switch (opt) {
            case 1:
               gp.execCadastrar();
               break;
            case 2:
               gp.execDarEntrada();
               break;
            case 3:
               gp.execDarSaida();
               break;
            case 4:
               gp.execConsultar();
               break;
            case 5:
               gp.execMostrarNivel();
               break;
            case 6:
               break;
            default:
               System.out.println("Valor digitado é inválido");


         }
      } while (opt != 6);
   }
      public void execCadastrar () {
         System.out.printf("Informe o id ");
         System.out.println(("e depois o nome do produto "));
         produto.produto = Integer.parseInt(scanner.nextLine());
         produto.descricao = scanner.nextLine();
         System.out.println("Informe o nivel ");
         produto.nivel = Long.parseLong(scanner.nextLine());
         System.out.println("Informe o valor ");
         produto.valor = Double.parseDouble(scanner.nextLine());
      }


   public void execDarEntrada() {
      System.out.println("digite a quantidade para dar entrada");
      if (produto.entrada(Long.parseLong(scanner.nextLine()))) {
         System.out.println("Entrada relalizada");
      } else {
         System.out.println("entrada nao realizada");
      }
   }

      public void execDarSaida(){
         System.out.println("digite a quantidade para dar saida");
         if (produto.saida(Long.parseLong(scanner.nextLine()))) {
            System.out.println("saida relalizada");
         } else {
            System.out.println("saida nao realizada");
         }

      }
      public void execConsultar(){
         produto.imprimir();
      }

      public void execMostrarNivel(){
         produto.checarNivel();
   }
}


