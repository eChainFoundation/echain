package com.echain.solidity;

import java.io.File;
import java.math.BigInteger;
import java.util.List;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;

import com.echain.solidity.ECtoken_sol_ECtoken.TransferEventResponse;

public class ECtokenTest {
	
	private static Web3j web3j = Web3JClient.getClient();

	public static void main(String[] args) throws Exception {
//		String walletfile = "/Users/roc/Downloads/wallet/UTC--2018-03-27T07-57-53.477762418Z--cf8e15d01d5f932a6c880757854bcfd3fd4b90e5";
		String walletfile = "/Users/roc/Downloads/wallet/UTC--2018-04-08T11-55-10.637000000Z--37973061bf8dfec6e3d1799fa08d7e210d74588d.json";
		Credentials credentials = WalletUtils.loadCredentials("123456", walletfile);
//		String str = WalletUtils.generateLightNewWalletFile("123456", new File("/Users/roc/Downloads/wallet/"));
//		System.out.println(str);
		
		ECtoken_sol_ECtoken contract = load(credentials);//deploy(credentials);
		
//		System.out.println(contract.getContractAddress());
		
//		TransactionReceipt t1 = contract.transfer("0x08b970c45d5af01aea5b9ce3556ccf34375a4f95", BigInteger.valueOf(2000000l)).send();
//		TransactionReceipt t2 = contract.transfer("0x74923229cbacea5ff3ea8f11144cf6a3a72d9567", BigInteger.valueOf(3000000l)).send();
		
		contract.approve("0x37973061bf8dfec6e3d1799fa08d7e210d74588d", BigInteger.valueOf(30000000l)).send();
		TransactionReceipt t3 = contract.transferFrom("0x37973061bf8dfec6e3d1799fa08d7e210d74588d","0x74923229cbacea5ff3ea8f11144cf6a3a72d9567", BigInteger.valueOf(30000000l)).send();

		
//		contract.approve("0xcf8e15d01d5f932a6c880757854bcfd3fd4b90e5", BigInteger.valueOf(300000000000000l)).send();
//		TransactionReceipt t4 = contract.transferFrom("0xcf8e15d01d5f932a6c880757854bcfd3fd4b90e5","37973061bf8dfec6e3d1799fa08d7e210d74588d", BigInteger.valueOf(300000000000000l)).send();

		List<TransferEventResponse> tfs = contract.getTransferEvents(t3);
		
		for(TransferEventResponse tf : tfs) {
			System.out.println("tf.from  =  " + tf.from);
			System.out.println("tf.to  =  " + tf.to);
			System.out.println("tf.value  =  " + tf.value);
		}
//		
//		
//		System.out.println(contract.balanceOf("0xcf8e15d01d5f932a6c880757854bcfd3fd4b90e5").send());
		System.out.println(contract.balanceOf("0x37973061bf8dfec6e3d1799fa08d7e210d74588d").send());
		System.out.println(contract.balanceOf("0x74923229cbacea5ff3ea8f11144cf6a3a72d9567").send());
//		
//		System.out.println(contract.allowance("0x74923229cbacea5ff3ea8f11144cf6a3a72d9567", "0x80f532bb797feaa867a97dd3debeee8b2492413a").send());
		
//		0xcf8e15d01d5f932a6c880757854bcfd3fd4b90e5    true
//0x74923229cbacea5ff3ea8f11144cf6a3a72d9567
		
	}
	
	public static ECtoken_sol_ECtoken deploy(Credentials credentials) throws Exception {
		ECtoken_sol_ECtoken sss = ECtoken_sol_ECtoken.deploy(web3j, credentials, ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT).send();
		
		return sss;
	}
	
	public static ECtoken_sol_ECtoken load(Credentials credentials) throws Exception {
		ECtoken_sol_ECtoken sss = ECtoken_sol_ECtoken.load("0x80f532bb797feaa867a97dd3debeee8b2492413a", web3j, credentials, ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT);
		
		return sss;
	}
}
