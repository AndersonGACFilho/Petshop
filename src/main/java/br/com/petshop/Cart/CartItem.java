package br.com.petshop.Cart;

import javax.persistence.Entity;

@Entity
public class CartItem{
	private Item item;
	private Integer quantity;
	
	public CartItem(Item item,Integer quantity){
		this.setItem(item);
		this.setQuantity(quantity);
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
