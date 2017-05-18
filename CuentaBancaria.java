/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamen;

/**
 *
 * @author donbala
 */
public abstract class CuentaBancaria {
	
	private String nombre;
	protected double saldo;
	//private double interesDeposito;
	
	abstract double getInteresDeposito();
	
	
	/*
	public double getInteresDeposito() {
		return interesDeposito;
	}

	public void setInteresDeposito(double interesDeposito) {
		this.interesDeposito = interesDeposito;
	}
	*/

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

	public void deposito(double deposito){

		double totalInteres =0;
		if(deposito<1000)
			totalInteres = deposito*getInteresDeposito();
		
		this.saldo += deposito + totalInteres;
	}
	
	public void retiro(double retiro){
		this.saldo -=retiro;
	}

    

    
}
