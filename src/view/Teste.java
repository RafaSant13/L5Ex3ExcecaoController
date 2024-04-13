package view;

import controller.OperacaoController;

public class Teste {

	public static void main(String[] args) {
		OperacaoController oc = new OperacaoController();
		
		try {
			System.out.println(oc.operacaoValor(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(oc.operacaoValor(5));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(oc.operacaoValor(-14));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
