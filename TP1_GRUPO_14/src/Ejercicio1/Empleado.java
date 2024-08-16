
package Ejercicio1;

public class Empleado {
	private int id;
	private String nombre;
	private int edad;
	private static int cont=999;

	public Empleado() {
		cont++;
		this.id= cont;
		this.nombre="sin nombre";
		this.edad= 99;
	}

	public Empleado(String nombre, int edad)
	{
		cont++;
		this.id= cont;
		this.nombre = nombre;
		this.edad = edad;

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad + "]";
	}

	public void devuelveProximoId() {
		int aux;
		aux = (getId()+1);
		System.out.println("Este es el proximo ID: " + aux);
	}
	
	
}
