package Cuenta;

import java.util.Scanner;

import Cuenta.CuentaBancaria;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cuentaBan = new CuentaBancaria();
		CuentaBancaria CuentaAhorro = new CuentaBancaria();
		CuentaBancaria CuentaCorriente = new CuentaBancaria();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su tipo de cuenta");
		String tipoDeCuenta = sc.nextLine().toUpperCase();

		if (tipoDeCuenta.equals("CC")) {

			System.out.println("Ingrese sus nombres completos :");
			CuentaCorriente.setNombre(sc.nextLine().toUpperCase());
			System.out.println("ingrese su saldo :$");
			
			CuentaCorriente.setSaldo(Double.parseDouble(sc.nextLine()));

			if (CuentaCorriente.getSaldo() <= 1000) {

				CuentaCorriente.setSaldo(CuentaCorriente.getSaldo() * 1.01);

				System.out.println("Estimado usuario " + CuentaCorriente.getNombre()
						+ " usted ha recibido un aumento del 1 % su saldo actual CC es de $"
						+ CuentaCorriente.getSaldo());

			} else {
				System.out.println("Estimado  " + CuentaCorriente.getNombre() + " su saldo actual es de  $ "
						+ CuentaCorriente.getSaldo());

			}

		}
		else if  (tipoDeCuenta.equals("CA")) {

			System.out.println("Ingrese sus nombres completos :");
			CuentaAhorro.setNombre(sc.nextLine().toUpperCase());
			System.out.println("ingrese su saldo :$");
			CuentaAhorro.setSaldo(Double.parseDouble(sc.nextLine()));

			System.out.println("Estimado  " + CuentaAhorro.getNombre() + " su saldo actual CA es de  $ "
					+ CuentaAhorro.getSaldo());

		}
		
		else
		System.out.println("USTED DEBE DE INGRESAR UN CC O CA");
	}

}
