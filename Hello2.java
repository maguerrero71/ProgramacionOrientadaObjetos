import java.io.*;

class Hello2 
{
	public static void main(String[] arguments)throws IOException 
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String dato;
		System.out.println("!!!!!!!!!!!Bienvenido !!!!!!"); 
		System.out.println("**Cual Es Tu Nombre ?");
		dato = lectura.readLine();
		System.out.println("Bienvenido(a),  "+ dato +" Mi Nombre Es Equipo 13");
	}

}