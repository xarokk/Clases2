package ejercicio9;

public class CuentaAtras implements Runnable{
	/*public CuentaAtras() 
	{	
		super("" + numero);
		start();
	} 
 */
	public  int numero ;
	public  String Id;
	
	public int i= 0;
	
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
	}