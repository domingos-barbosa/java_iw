package br.com.iw;
import br.com.iw.PedidoQ23;
import java.util.Scanner;

public class DemoPedidoQ23 {

public static void main(String[] args) {


int i=0;
double d=0.0;

PedidoQ23 p = new PedidoQ23();
Scanner sc = new Scanner(System.in);

System.out.println("Entre com o ID do Pedido ");

i=sc.nextInt();
p.setPedidoID(i);

System.out.println("Entre com o ID do Item ");
i=sc.nextInt();
p.setItemID(i);

sc.nextLine();//limpa o buffer

System.out.println("Entre com o Preço do Item ");
d=sc.nextDouble();
p.setPrecoPorItem(d);

sc.nextLine();//limpa o buffer

System.out.println("Entre com a Quantidade do Produto ");
i=sc.nextInt();
p.setQtd(i);

  System.out.println("");
  System.out.println("     -----      ");
  System.out.println("");
  
  
System.out.println (p.toString());

System.out.println("\n" + "Valor do Pedido = " + p.valorDoPedido());

sc.close();

  }

}
