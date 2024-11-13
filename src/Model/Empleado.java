package Model;

public abstract class Empleado {
	private String nombre;
	private int id;
	private double salarioBase;
	
	public Empleado(String nombre, int id, double salarioBase) {
		this.nombre = nombre;
		this.id = id;
		this.salarioBase = salarioBase;
	}
	
	public abstract double calcularSalario();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", salarioBase=" + salarioBase + "]";
	}
	
}
