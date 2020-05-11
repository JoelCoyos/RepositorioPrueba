package paquete;

public class Usuario  {

	String nombre,contraseña;

	public Usuario(String nombre, String contraseña) {
		try {
			setNombre(nombre);
		} catch (NombreInvalidoException e) {
			System.out.println("No es un nombre valido");
		}
		try {
			setContraseña(contraseña);
		} catch (NombreInvalidoException e) {
			System.out.println("No es una constraseña valida");
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

	public void setContraseña(String contraseña) throws NombreInvalidoException {
		char c = Character.toUpperCase(contraseña.charAt(0));
		if(contraseña.length()>6 && (c>='A') && (c <='Z'))
		{
			this.contraseña = contraseña;
		}
		else
		{
			throw new NombreInvalidoException(contraseña);
		}
			
	}

	public String getNombre() {
		return nombre;
	}

	public String getContraseña() {
		return contraseña;
	}
	


	
	
	
	
	

}
