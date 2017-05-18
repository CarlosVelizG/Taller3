/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamen;


public class CuentaCorriente extends CuentaBancaria {

    @Override
    double getInteresDeposito() {
        return 0.01;
    }
	
	/*
	public void deposito(double deposito) {
		double interes=0;
		if(deposito<1000)
			interes = deposito * 0.01;
		
		this.saldo = this.saldo +deposito + interes;
	}*/
	
	
}
