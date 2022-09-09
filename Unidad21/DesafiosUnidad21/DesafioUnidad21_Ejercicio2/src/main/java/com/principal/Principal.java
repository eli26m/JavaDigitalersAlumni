package com.principal;

import com.entidades.CuentaAhorro;
import com.entidades.CuentaCorriente;
import com.entidades.TarjetaCredito;

public class Principal {

	public static void main(String[] args) {
	
		CuentaAhorro ca = new CuentaAhorro(1, 1);
		System.out.println(ca.toString());
		
		CuentaCorriente cc = new CuentaCorriente(1, 2);
		System.out.println(cc.toString());
		
		TarjetaCredito tc = new TarjetaCredito(1, 1, 998);
		System.out.println(tc.toString());

	}

}
