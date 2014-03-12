package ejercicio8;

import java.util.Set;



public class CuentaAtras extends Thread {
	/*public CuentaAtras() 
	{	
		super("" + numero);
		start();
	} 
 */
	public  int numero ;
	public  String Id;
	
	public int i= 0;
	public int Identif;
	public Thread[] threadArray;
	
	public  CuentaAtras(String id, int n)
	{	
		//numero[i] = n;
		//Id[i] = id;
		numero = n;
		Id = id;
		
		
		//start();
		//start();
		

	
	
	}
	public String toString()
	{System.out.print("Cuenta atras de " + Id + "    ");
		
	if(numero== 0)
	{
		 Identif = numero;
		 Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		 threadArray = threadSet.toArray(new Thread[threadSet.size()]);
	}else
	{
		Identif = 100;
	}
		return " Cuenta atras en: "+ numero +"\n";
		
		 
	}
	public void run()
	{
		while(true)
		{
			System.out.println(this);
			//numero--;
			if(numero != 0)
			{
				numero = numero -1 ;
			}else
			{
				break;
			}
				
			i++;
			
		}
	}

	

	/*
	 * int Contador ; String Nombre ; int incrementador = --Contador; public
	 * CuentaAtras(String Id, int numero) { int Contador = numero; String Nombre
	 * = Id ;
	 * 
	 * 
	 * System.out.print("Cuenta atras de " + Nombre + "\n");
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public void run() { while(true) { System.out.println( Nombre +
	 * "Cuenta atras en (" + incrementador + ")"); if (incrementador == 0)
	 * return; } }
	 * 
	 * /* public static void main (String[] args) {
	 * 
	 * for(int i = 0 ; i< 3; i++)
	 * 
	 * CuentaAtras(Nombre,Contador).start();
	 * System.out.print("Todos los hilos Arrancados");
	 * 
	 * }
	 */

}
