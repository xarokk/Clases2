package ejercicio10;

import java.util.Set;

public class CuentaAtras extends Thread
{
	public  int numero ;
	public  String Id;
	public int Identif;
	public Thread[] threadArray;
	
	public int i;
	
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
				
			
			
		}
	}


}
