package br.com.petshop.cart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import br.com.petshop.model.person.Client;

public class Cart {
	private Client client;
	private List<CartItem> cart= new ArrayList<CartItem>();
	private BigDecimal amount = BigDecimal.ZERO;
	@SuppressWarnings("unused")
	private boolean wasEncontred = false;
	
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
	public void addCart(Item item) {
		for(CartItem cartItem : cart) {
			if (cartItem.getItem().getId()==item.getId()) {
				wasEncontred=true;
				cartItem.setQuantity(cartItem.getQuantity()+1);
				break;
			}
		}
		if(wasEncontred=false) {
			CartItem cartItem = new CartItem(item);
			cart.add(cartItem);
		}
		amount.add(item.getSellPrice());
	}
	public void removeCart(CartItem cartItem) {
		cart.remove(cartItem);
	}
	public void removeCartQuantity(CartItem cartItem) {
		if(cartItem.getQuantity()==1) {
			removeCart(cartItem);
		}
		else {
			cartItem.setQuantity(cartItem.getQuantity()-1);
		}
	}
}
