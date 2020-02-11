package br.com.iw;
import br.com.iw.PedidoQ22;

public class DemoPedidoQ22 {

  public static void main(String[] args) {

double valorDoPedido;

PedidoQ22 ped = new PedidoQ22();
ped.pedidoID = 100;
ped.itemID = 200;
ped.precoPorItem = 2.0;
ped.qtd=12;

valorDoPedido = ped.precoPorItem * ped.qtd;

System.out.println ("ID do Pedido: " + ped.pedidoID + "\n" + "ID do Item: " + ped.itemID + "\n\n" + "Preço por Item = " + ped.precoPorItem +"\n" + "Quantidade = " + ped.qtd + "\n" + "Valor do Pedido = " + valorDoPedido);

  }

}
