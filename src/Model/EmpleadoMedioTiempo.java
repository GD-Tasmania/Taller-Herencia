package Model;

import java.util.ArrayList;

public class EmpleadoMedioTiempo extends Empleado implements Beneficios {
	private ArrayList<String> beneficios;

	public EmpleadoMedioTiempo(String nombre, int id, double salarioBase) {
		super(nombre, id, salarioBase);
		// TODO Auto-generated constructor stub
		this.beneficios = new ArrayList<String>();
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase()/2;
	}

	public ArrayList<String> obtenerBeneficios() {
		// TODO Auto-generated method stub
		return this.beneficios;
	}

	@Override
	public void agregarBeneficios(String beneficio) {
		// TODO Auto-generated method stub
		this.beneficios.add(beneficio);
	}

	@Override
	public String toString() {
		return "EmpleadoMedioTiempo [beneficios=" + beneficios + "]";
	}

}
