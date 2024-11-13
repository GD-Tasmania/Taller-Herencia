import javax.swing.JOptionPane;

import Model.Empleado;
import Model.EmpleadoContratista;
import Model.EmpleadoMedioTiempo;
import Model.EmpleadoTiempoCompleto;
import Model.Empresa;

public class Main {
	
	public static Empresa emp = new Empresa("");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		String menu = menu();
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			if (opcion == 1) {
				int opcSubMenu = Integer.parseInt(JOptionPane.showInputDialog(null, getSubMenu(opcion)));
				opcionesSubMenu(opcion, opcSubMenu);
			}
		} while(opcion != 2);
	}
	
	/* ---------- MENUS ---------- */
	private static String menu() {
		String menu = "Ingrese una opcion:\n"
				+ "1. Gestionar empleados.\n"
				+ "2. Salir.";
		return menu;
	}
	
	private static String getSubMenu(int menu) {
		String subMenu = "Ingrese una opcion:\n";
		switch (menu) {
		case 1:
			subMenu += "1. Agregar empleado.\n"
					+ "2. Calcular salario.\n"
					+ "3. Mostrar beneficios.\n"
					+ "4. Volver";
			break;
		default:
			break;
		}
		return subMenu;
	}
	
	private static void opcionesSubMenu(int opcion, int subMenu) {
		switch (opcion) {
		case 1:
			opcionesEmpleados(subMenu);
			break;
		default:
			break;
		}
	}
	
	/* ---------- EMPLEADOS ---------- */
	public static void opcionesEmpleados(int subMenu) {
		switch (subMenu) {
		case 1:
			agregarEmpleado();
			break;
		case 2:
			calcularSalario();
			break;
		case 3:
			mostrarBeneficios();
			break;
		default:
			break;
		}
	}
	
	public static void agregarEmpleado() {
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de empleado: \n"
				+ "1. Tiempo completo.\n" + "2. Medio tiempo.\n" + "3. Contratista."));
		
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id: "));
		Double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base: "));

		if(tipo == 1) {			
			EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto(nombre, id, salarioBase);
			emp.agregarEmpleados(empleado);
			int cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantos beneficios desea agregar: "));
			for (int i = 0; i < cant; i++) {
				String beneficios = JOptionPane.showInputDialog("Agregue el nombre del beneficio: ");
				empleado.agregarBeneficios(beneficios);
			}
			JOptionPane.showMessageDialog(null, "Agregado");
		} else if(tipo == 2) {
			EmpleadoMedioTiempo empleado = new EmpleadoMedioTiempo(nombre, id, salarioBase);
			emp.agregarEmpleados(empleado);
			int cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantos beneficios desea agregar: "));
			for (int i = 0; i < cant; i++) {
				String beneficios = JOptionPane.showInputDialog("Agregue el nombre del beneficio: ");
				empleado.agregarBeneficios(beneficios);
			}
			JOptionPane.showMessageDialog(null, "Agregado");
		} else if(tipo == 3){
			int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
			EmpleadoContratista empleado = new EmpleadoContratista(nombre, id, salarioBase, horasTrabajadas);
			emp.agregarEmpleados(empleado);
			JOptionPane.showMessageDialog(null, "Agregado");
		} else {
			JOptionPane.showMessageDialog(null, "Opcion incorrecta");
		}
	}
	
	
	public static void calcularSalario() {
		JOptionPane.showMessageDialog(null, emp.calcularSalarioEmpleados());
	}
	
	public static void mostrarBeneficios() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del empleado: "));
		for (Empleado empleado : emp.getEmpleados()) {
			if(empleado.getId() == id) {
				if (empleado instanceof EmpleadoTiempoCompleto) {
					EmpleadoTiempoCompleto empleadoTiempoCompleto = (EmpleadoTiempoCompleto) empleado;
					JOptionPane.showMessageDialog(null, empleadoTiempoCompleto.toString());
				} else if (empleado instanceof EmpleadoMedioTiempo) {
					EmpleadoMedioTiempo empleadoMedioTiempo = (EmpleadoMedioTiempo) empleado;
					JOptionPane.showMessageDialog(null, empleadoMedioTiempo.toString());
				}
			}
		}
	}

}
