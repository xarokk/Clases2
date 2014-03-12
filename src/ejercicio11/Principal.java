package ejercicio11;


//vamos a distinguir llamar a los dos threads por separado - sin Runnable y con Runnable
public class Principal{

	public static void main(String[] arg)
	{
		
		
		CuentaAtras9 ca9_1 = new CuentaAtras9();
		
		CuentaAtras9 ca9_2 = new CuentaAtras9();
		
		CuentaAtras9 ca9_3 = new CuentaAtras9();
		
		ca9_1.dame_datos("ID1R", 4);
		ca9_2.dame_datos("ID2R", 7);
		ca9_3.dame_datos("ID3R", 8);
		
		
		
		try {
			(new Thread(ca9_1)).start();
			(new Thread(ca9_2)).start();
			(new Thread(ca9_3)).start();
			} catch (Exception e) {
				
				e.printStackTrace();
		    }
		
		
	}
}
