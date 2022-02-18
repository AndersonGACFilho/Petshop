package br.com.petshop.Cart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import br.com.petshop.model.person.Client;

public class Cart {
	private Client client;
	private List<CartItem> cart= new ArrayList<CartItem>();
	private BigDecimal amount = BigDecimal.ZERO;
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<CartItem> getCart() {
		return cart;
	}
	public void addCart(Item item, Integer quantity) {
		boolean wasEncontred=false;
		for(CartItem cartItem : cart) {
			if (cartItem.getItem().getId()==item.getId()) {
				
			}
		}
		CartItem cartItem = new CartItem(item,quantity);
		cart.add(cartItem);
		amount.add(item.getSellPrice().multiply(BigDecimal.valueOf(quantity)));
	}
	public void removeCart(CartItem cartItem) {
		boolean wasEncontred=false;
		for(CartItem item : cart) {
			
		}
	}
}
