package Model;

public class EmpleadoContratista extends Empleado {
	private int horasTrabajadas;

	public EmpleadoContratista(String nombre, int id, double salarioBase, int horasTrabajadas) {
		super(nombre, id, salarioBase);
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		double valorHora = (getSalarioBase()/30)/8;
		return valorHora*this.horasTrabajadas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public String toString() {
		return "EmpleadoContratista [horasTrabajadas=" + horasTrabajadas + "]";
	}

}
