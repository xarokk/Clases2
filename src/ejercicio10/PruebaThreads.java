package ejercicio10;



public class PruebaThreads {
	
	public static void main(String args[])
	{
		
		
	CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		new Thread(new CuentaAtras(contador1.Id,contador1.numero)).start();
	 String Identificador1 =contador1.Id;
	// contador1.getId();
	 int numero1 = contador1.Identif;
		if(numero1 == 0)
		{			new UltimaEscritura(Identificador1);
			if(contador1.threadArray == null)
			{
				System.out.println("No hay ningun Thread activo");
			}else
			{
				System.out.println("treads activos"+ contador1.threadArray);
			}
		}
			
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		new Thread(new CuentaAtras(contador2.Id,contador2.numero)).start();
		String Identificador2 =contador2.Id;	
		int numero2 = contador2.Identif;
		if(numero2 == 0)
		{			new UltimaEscritura(Identificador2);
		if(contador1.threadArray == null)
		{
			System.out.println("No hay ningun Thread activo");
		}else
		{
			System.out.println("treads activos"+ contador2.threadArray);
		}}



	CuentaAtras contador3 = new CuentaAtras("ID3", 8);
	new Thread(new CuentaAtras(contador3.Id,contador3.numero)).start();
	String Identificador3 =contador3.Id;
	int numero3 = contador3.Identif;
	if(numero3 == 0)
	{			new UltimaEscritura(Identificador3);
	if(contador1.threadArray == null)
	{
		System.out.println("No hay ningun Thread activo");
	}else
	{
		System.out.println("treads activos"+ contador3.threadArray);
	}}
	
	}

}
