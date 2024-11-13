package Model;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> empleados;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void agregarEmpleados(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public String calcularSalarioEmpleados() {
		String mensaje = "";
		for (Empleado empleado : this.empleados) {
			mensaje += "El salario de "+empleado.getNombre()+" es "+empleado.calcularSalario()+"\n";
		}
		return mensaje;
	}
}
