package com.itaz.OKWallet.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WalletVO {
	
	public String userUid;
	public String oldAddress;
	public String address;
	public int balance = 0;
	public int amount = 0;
	public String status;
	public String type;
	public String from;
	public String to;
	public String privateKey;
	public String item;
}
