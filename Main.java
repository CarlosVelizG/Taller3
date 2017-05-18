
package fundamen;

public class Main {
    public static void main(String[] args) {
        
       //Creamos los objetos instancia clase padre a hijas 
       CuentaBancaria cta1=new CuentaAhorro();
       CuentaBancaria cta2=new CuentaAhorro();
       //CuentaAhorro ct=new CuentaBancaria();
       CuentaBancaria cta3=new CuentaCorriente();
        
        //Seteamos los valor utilizando el metodo set es decir enviamos los valores
	cta1.setNombre("Ahorro");
	cta2.setNombre("Ahorro");
	cta3.setNombre("Corriente");
        
	cta1.setSaldo(0);
        cta2.setSaldo(0);
        cta3.setSaldo(0);
                
                
        cta1.deposito(100);
        cta2.deposito(200);
        cta3.deposito(300);
                
        //llamada del método        
        imprimirSaldo(cta1);
        imprimirSaldo(cta2);
        imprimirSaldo(cta3);
              
                
                /*cta2.setInteresDeposito(0.01); esto no se hace 
        El error consitia en que no retornava el valor en el método getInteresDeposito
        ya que al invocarlo este no retornava el valor dado en este caso 0.01 y uno no lo 
        puede settear es decir enviarle por referencia dicho valor, se solucina con @Override del
        método antes mencionado y retonar el valor definido en las clases, como eran 2 tipos de %
        en casa clase se retorna valores diferentes (0.02 para CuentaAhorro) y (0.01 para CuentaCorriente)
        si se calcula el deposito para CuentaAhorro llamamos al método GetInteres() este se ejecuta pero como es 
        llamado con un objeto instanciado con la clase CuentaAhorro y ademas dentro de ella esta el métdo con 
        sobre Escritura tienen el mismo nombre pero con valores difrentes asi se solucionó el problema
        */
        
                
        //pruebas
        
           // valores a la clase cuentaCorriente
	CuentaBancaria corriente =new CuentaCorriente();
	corriente.setNombre("Corriente");
        corriente.setSaldo(0);
	corriente.deposito(500);
        imprimirSaldo(corriente);
                
               
	CuentaBancaria corriente1 =new CuentaCorriente();
	corriente1.setNombre("Corriente");
        corriente1.setSaldo(10);
	corriente1.deposito(1000);
        imprimirSaldo(corriente1);
                
            
        //valores a la clase CuentaAhorro
        CuentaBancaria ahorro =new CuentaAhorro();
        ahorro.setNombre("Ahorro");
        ahorro.setSaldo(10);
        ahorro.deposito(200);
        imprimirSaldo(ahorro);
    
	}
	
	public static void imprimirSaldo(CuentaBancaria cta){
		System.out.println("   *  Cuenta: " + cta.getNombre() + ", Saldo: " + cta.getSaldo());
	}
    }
    

