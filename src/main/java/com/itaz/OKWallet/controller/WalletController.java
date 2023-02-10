package com.itaz.OKWallet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itaz.OKWallet.res.ResWallet;
import com.itaz.OKWallet.vo.CreateWalletData;
import com.itaz.OKWallet.vo.NftVO;
import com.itaz.OKWallet.vo.TxVO;
import com.itaz.OKWallet.vo.WalletVO;

@RestController
public class WalletController {
	
	@GetMapping("/")
	public Object getIndex() {
		
		System.out.println("***********************************");
		System.out.println("getIndex : userUid >>>>>>>>>>>>>>> ");
		System.out.println("***********************************");
		
		TxVO txVO = new TxVO();
		txVO.setHash("hash");
		txVO.setStatus("status");
		txVO.setLogUid(0);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");	
		resWallet.setTx(txVO);
		
		return resWallet;
	}

	@GetMapping("/api/v1/users/{userUid}/wallets")
	public Object getWallets(@PathVariable("userUid") String userUid, String status) {

		System.out.println("***********************************");
		System.out.println("getWallets : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("***********************************");
		
		NftVO nvo = new NftVO();
		nvo.setTokenId(1);
		nvo.setTokenUri("https://");
		nvo.setName("name");
		
		List<NftVO> nftList = new ArrayList<NftVO>();
		nftList.add(nvo);
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		vo.setBalance(10000);
		vo.setStatus("USE");
		
		TxVO txVO = new TxVO();
		txVO.setHash("hash");
		txVO.setStatus("status");
		txVO.setLogUid(0);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);
		resWallet.setTx(txVO);
		
		return resWallet;
	}
	
	@PostMapping(value="/api/v1/users/{userUid}/wallets")
	@ResponseBody
	public Object postWallets(@PathVariable("userUid") String userUid, @RequestBody CreateWalletData payload) {
		System.out.println("***********************************");
		System.out.println("postWallets : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("postWallets : payload >>>>>>>>>>>>>>> " + payload);
		System.out.println("***********************************");
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		
		TxVO txVO = new TxVO();
		txVO.setHash("hash");
		txVO.setStatus("status");
		txVO.setLogUid(0);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);
		resWallet.setTx(txVO);		
		
		return resWallet;
	}
	
	@GetMapping("/api/v1/users/{userUid}/wallets/{address}")
	public Object delWallet(@PathVariable("userUid") String userUid, @PathVariable("address") String address) {
		System.out.println("***********************************");
		System.out.println("delWallet : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("delWallet : address >>>>>>>>>>>>>>> "+address);
		System.out.println("***********************************");
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);	
		
		return resWallet;
	}
	
	@GetMapping("/api/v1/users/{userUid}/wallets/recovery")
	public Object recoveryWallet(@PathVariable("userUid") String userUid, String address) {
		
		System.out.println("***********************************");
		System.out.println("recoveryWallet : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("recoveryWallet : address >>>>>>>>>>>>>>> "+address);
		System.out.println("***********************************");
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x1aE0EA34a72D944a8C7603FfB3eC30a6669E454C");
		vo.setOldAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		vo.setBalance(10000);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);	
		
		return resWallet;
	}
}
