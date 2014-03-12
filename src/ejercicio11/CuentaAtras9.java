package ejercicio11;





public class CuentaAtras9 implements Runnable {
	
	
	public String ID;
	public int numero;


	public static String ultimaEscritura="No hay ninguna escritura";
	
	public  synchronized void dame_datos(String id, int num)
	{
		ID = id;
		numero = num;
	}

	
	public synchronized static String getUltimaEscritura() 
	{
		return ultimaEscritura; 
	}

	public synchronized static void setUltimaEscritura(String ultimaEscritura) 
	{
		CuentaAtras9.ultimaEscritura = ultimaEscritura;
		
	}

	public void run()   
	{
	    try 
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
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			setUltimaEscritura("La ultima escritura ha sido " + ID);
	        Thread.sleep(1000);
	      
	    }
	    catch(InterruptedException e)     
	    {
	       e.printStackTrace();
	    }
	    
	    finally{
	    	System.out.println("Final ==>  " + ID);
	    }
	  }
	

}

