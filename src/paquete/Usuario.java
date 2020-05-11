package paquete;

public class Usuario  {

	String nombre,contrase�a;

	public Usuario(String nombre, String contrase�a) {
		try {
			setNombre(nombre);
		} catch (NombreInvalidoException e) {
			System.out.println("No es un nombre valido");
		}
		try {
			setContrase�a(contrase�a);
		} catch (NombreInvalidoException e) {
			System.out.println("No es una constrase�a valida");
		}
	}	

	public void setNombre(String nombre) throws NombreInvalidoException {
		if(nombre!=null && nombre!="")
		{
			this.nombre = nombre;
		}
		else
		{
			throw new NombreInvalidoException(nombre);
		}
	}

	public void setContrase�a(String contrase�a) throws NombreInvalidoException {
		char c = Character.toUpperCase(contrase�a.charAt(0));
		if(contrase�a.length()>6 && (c>='A') && (c <='Z'))
		{
			this.contrase�a = contrase�a;
		}
		else
		{
			throw new NombreInvalidoException(contrase�a);
		}
			
	}

	public String getNombre() {
		return nombre;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	


	
	
	
	
	

}
