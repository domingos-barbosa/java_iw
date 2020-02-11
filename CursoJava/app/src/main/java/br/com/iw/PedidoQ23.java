package br.com.iw;

public class PedidoQ23 {

private int pedidoID;
private int itemID;
private double precoPorItem;
private int qtd;

public void setPedidoID(int pedidoID)
   {
    this.pedidoID = pedidoID;
   }
public int getPedidoID()
   {
     return pedidoID;   
   }
   
   
public void setItemID(int itemID) 
   {
    this.itemID = itemID;
   }
public int getItemID()
   {
     return itemID;   
   }
   

public void setPrecoPorItem(double precoPorItem) 
   {
    this.precoPorItem = precoPorItem;
   }
public double getPrecoPorItem()
   {
     return precoPorItem;
   }
   
   
 public void setQtd(int qtd) 
   {
    this.qtd = qtd;
   }
public int getQtd()
   {
     return qtd;
   }
   
   
   
public double valorDoPedido(){
    double valorDoPedido;

    valorDoPedido = this.precoPorItem * this.qtd;
     
     return valorDoPedido;
   }
   
   @Override
public String toString() {
    return "ID do Pedido: " + this.pedidoID + "\n" + "ID do Item: " + this.itemID + "\n\n" + "Preço por Item = " + this.precoPorItem +"\n" + "Quantidade = " + this.qtd;
   
 }
} 
