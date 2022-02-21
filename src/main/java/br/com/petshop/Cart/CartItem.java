package br.com.petshop.cart;

public class CartItem{
	private Item item;
	private Integer quantity;
	
	public CartItem(Item item){
		this.setItem(item);
		quantity=1;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
