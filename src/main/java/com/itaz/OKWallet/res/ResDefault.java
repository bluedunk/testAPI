package com.itaz.OKWallet.res;

import com.itaz.OKWallet.vo.TxVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResDefault {

	public Integer code;
	public String message;
	public TxVO tx;
	public String payload;
	
}
