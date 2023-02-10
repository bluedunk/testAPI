package com.itaz.OKWallet.res;

import com.itaz.OKWallet.vo.TxVO;
import com.itaz.OKWallet.vo.WalletVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResWallet {

	public Integer code;
	public String message;
	
	public TxVO tx;
	
	public WalletVO payload;
}
