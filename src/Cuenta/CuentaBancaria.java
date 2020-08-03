package Cuenta;

public class CuentaBancaria {
	public String nombre;
	public double saldo;

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double saldo(){
		return saldo;
		
	}

	public void depositar(double dinero) {
		if (saldo <= 1000) {
			saldo +=  saldo * 0.1;
		} 
		else {
			saldo = dinero;
			
		}
		
	}


	public static void Retiro() {
		
		
	}
	
	
	
}
