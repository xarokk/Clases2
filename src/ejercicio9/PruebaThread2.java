package ejercicio9;



public class PruebaThread2 {
	
		public static void main(String args[])
		{
		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
			new Thread(new CuentaAtras(contador1.Id,contador1.numero)).start();
			
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		new Thread(new CuentaAtras(contador2.Id,contador2.numero)).start();

		CuentaAtras contador3 = new CuentaAtras("ID3", 8);
		new Thread(new CuentaAtras(contador3.Id,contador3.numero)).start();

}
		}
