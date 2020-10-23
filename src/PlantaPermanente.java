
public class PlantaPermanente extends Empleado {
	private static final double VALORHORA = 300;
	private static final double VALORANTIGUEDAD = 100;
	private int antiguedad;
	
	public PlantaPermanente(boolean esCasado, int hijos, int horasTrabajadas, int antiguedad) {
		super(esCasado, hijos, horasTrabajadas);
		this.antiguedad = antiguedad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		double sueldo = super.getSalarioFamiliar();
		
		sueldo += super.getHorasTrabajadas() * PlantaPermanente.VALORHORA;
		sueldo += this.getAntiguedad() * PlantaPermanente.VALORANTIGUEDAD;
		
		return sueldo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	
	
}
