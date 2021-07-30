package futbol;

import java.lang.Comparable;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	
	
	public Futbolista(String nombre,int edad,String posicion){
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista(){
		this("Maradona",30, "delantero");
	}
	
	public String toString() {
		return "El futbolista " + nombre +" tiene " + edad + ", y juega de " +posicion;
	}
	
	public int compareTo(Object o) {
		
		return 0;
	}
	
	
	public abstract  boolean jugarConLasManos();
	
	public void setNombre(String nom) {
		nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	
	public String getPosicion() {
		return posicion;
	}

	
}