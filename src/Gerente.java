
public class Gerente extends PlantaPermanente{
	
	public Gerente(boolean esCasado, int hijos, int horasTrabajadas, int antiguedad) {
		super(esCasado, hijos, horasTrabajadas, antiguedad);
		// TODO Auto-generated constructor stub
	}



	private static final double VALORHORA = 400;
	private static final double VALORANTIGUEDAD = 150;
	
	
	
	@Override
	public double getSalario() {
		double sueldo = super.getSalarioFamiliar();
		
		sueldo += super.getHorasTrabajadas() * Gerente.VALORHORA;
		sueldo += this.getAntiguedad() * Gerente.VALORANTIGUEDAD;
		
		return sueldo;
	}
	

}
