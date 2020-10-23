
public class PlantaTemporal extends Empleado {
	
	private static final double VALORHORA = 200;
	
	public PlantaTemporal(boolean esCasado, int hijos, int horasTrabajadas) {
		super(esCasado, hijos, horasTrabajadas);
	}

	@Override
	public double getSalario() {
		double sueldo = super.getSalarioFamiliar();
		
		sueldo += super.getHorasTrabajadas() * PlantaTemporal.VALORHORA;
		
		
		return sueldo;
	}
	
}
