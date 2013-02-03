public class Test 
{
	public static void main ( String [] args ) 
	{
			System.out.println("Digite El Primer Valor: ");
			String s = System.console().readLine();
			System.out.println("Digite El Segundo Valor: ");
			String t = System.console().readLine();
			
			//if(s.isNumber && t.isNumber)
			//{
				int i = Integer.parseInt(s);
				double j = Double.parseDouble(t);
				System.out.println("************");
				System.out.println("************");
				System.out.println("************");
				
				System.out.println(s+ t);//Impresion De Cadenas
				System.out.println("************");
				System.out.println(i+j);//Impresion De Entero Mas Decimal
				System.out.println("************");
				System.out.println(s+j);//Impresion De Una Cadena Mas un decimal
				System.out.println("************");
				System.out.println(i+t);//Impresion De Un Entero Mas Una Cadena
				System.out.println("************");
				System.out.println(j+s);//Impresion De Un Decimal Mas Una Cadena
				System.out.println("************");
				System.out.println(t+j);//Impresion De Una Cadena Mas Un Decimal
			/*}
			else 
			{
				System.out.println(" ¡¡¡¡Error, debe digitar solamente numeros :P !!!!!! ");
			}*/
	}
		
}
	