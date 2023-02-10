package com.itaz.OKWallet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itaz.OKWallet.res.ResWallet;
import com.itaz.OKWallet.vo.WalletAddress;
import com.itaz.OKWallet.vo.WalletVO;

@RestController
public class OKCoinController {

	@GetMapping("/api/v1/users/{userUid}/wallets/{address}/balance")
	public Object balance(@PathVariable("userUid") String userUid, @PathVariable("address") String address) {
		System.out.println("***********************************");
		System.out.println("balance : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("balance : address >>>>>>>>>>>>>>> "+address);
		System.out.println("***********************************");
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		vo.setType("OK_MONEY_ACCOUNT");
		vo.setBalance(10000);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);	
		
		return resWallet;
	}
	
	@PostMapping("/api/v1/users/{userUid}/wallets/{address}/deposit")
	@ResponseBody
	public Object deposit(@PathVariable("userUid") String userUid, @PathVariable("address") String address, @RequestBody WalletAddress payload) {
		System.out.println("***********************************");
		System.out.println("deposit:payload >>>>>>>>>>>>>>> " + payload);
		System.out.println("***********************************");
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		vo.setAmount(1000);
		vo.setBalance(10000);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);	
		
		return resWallet;
	}
	
	@PostMapping("/api/v1/users/{userUid}/wallets/{address}/withdrawal")
	@ResponseBody
	public Object withdrawal(@PathVariable("userUid") String userUid, @PathVariable("address") String address, @RequestBody WalletAddress payload) {
		System.out.println("***********************************");
		System.out.println("withdrawal : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("withdrawal : address >>>>>>>>>>>>>>> "+address);
		System.out.println("withdrawal : payload >>>>>>>>>>>>>>> " + payload);
		System.out.println("***********************************");		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		vo.setAmount(1000);
		vo.setBalance(10000);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);	
		
		return resWallet;		
	}
	
	@PostMapping("/api/v1/users/{userUid}/wallets/{address}/transfer")
	@ResponseBody
	public Object transfer(@PathVariable("userUid") String userUid, @PathVariable("address") String address, @RequestBody WalletAddress payload) {
		System.out.println("***********************************");
		System.out.println("transfer : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("transfer : address >>>>>>>>>>>>>>> "+address);
		System.out.println("transfer : payload >>>>>>>>>>>>>>> " + payload);
		System.out.println("***********************************");
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setAddress("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		vo.setTo(payload.to);
		vo.setAmount(1000);
		vo.setBalance(10000);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);	
		
		return resWallet;	
	}
	
	@PostMapping("/api/v1/users/{userUid}/wallets/{address}/purchase")
	@ResponseBody
	public Object purchase(@PathVariable("userUid") String userUid, @PathVariable("address") String address, @RequestBody WalletAddress payload) {
		System.out.println("***********************************");
		System.out.println("purchase : userUid >>>>>>>>>>>>>>> "+userUid);
		System.out.println("purchase : address >>>>>>>>>>>>>>> "+address);
		System.out.println("purchase : payload >>>>>>>>>>>>>>> " + payload);
		System.out.println("***********************************");
		
		WalletVO vo = new WalletVO();
		vo.setUserUid("12345678");
		vo.setFrom("0x4B20993Bc481177ec7E8f571ceCaE8A9e22C02db");
		vo.setTo("0x1aE0EA34a72D944a8C7603FfB3eC30a6669E454C");
		vo.setType("OK_MONEY_ACCOUNT");
		vo.setItem("cryptopunks");
		vo.setAmount(2000);
		vo.setBalance(10000);
		
		ResWallet resWallet = new ResWallet();
		resWallet.setCode(200);
		resWallet.setMessage("ok");
		resWallet.setPayload(vo);	
		
		return resWallet;	
	}
}
