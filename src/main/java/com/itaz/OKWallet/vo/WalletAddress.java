package com.itaz.OKWallet.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WalletAddress {
	
	//@SerializedName("address")
	public String address;
	
	//@SerializedName("amount")
	public int amount;
	
	//@SerializedName("privateKey")
	public String privateKey;
	
	public String to;

}
