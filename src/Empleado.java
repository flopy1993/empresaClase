
abstract public class Empleado {
	private boolean esCasado;
	private int hijos;
	private int horasTrabajadas;
	

	public Empleado(boolean esCasado, int hijos, int horasTrabajadas) {

		this.esCasado = esCasado;
		this.hijos = hijos;
		this.horasTrabajadas = horasTrabajadas;
		
	}

	

	public double getSalarioFamiliar() {
		double salarioFamiliar = 200 * this.hijos;
		if(esCasado) {
			salarioFamiliar += 100;
		}
		return salarioFamiliar;
	}
	
	public abstract double getSalario();

	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	
	
}


