package ejercicio11;


public class CuentaAtras8 extends Thread {
	
	
	public String ID;
	public int numero;
	
	
	static String ultimaEscritura8;
		
	
	public synchronized static String getUltimaEscritura() 
	{
		return ultimaEscritura8; 	}

	public synchronized static void setUltimaEscritura(String ultimaEscritura) 
	{
		CuentaAtras8.ultimaEscritura8 = ultimaEscritura;
		
	}
	public void run()   
	{
		
	    for (;;)
		{
			
			if(numero==0)
			{
				break;
			}
			else
			{
				
				System.out.println(ID + " - " + numero + " - " + getUltimaEscritura());
				numero= numero - 1;
			
				
			}
			
		}
	    
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setUltimaEscritura("Última escritura " + ID);
	  }
	
	public  synchronized void dame_datos(String id, int num)
	{
		ID = id;
		numero = num;
	}
	
	public void ultimaEscritura()
	{
		
	}

}
