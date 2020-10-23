
public class Empresa {
	private Integer cuit;
	private String razonSocial;
	private Empleado[] empleados;
	
	public Empresa (String rs, Integer cuit, Empleado [] e){
		this.razonSocial = rs;
		this.cuit = cuit;
		this.empleados = e;
	}
	
	public double getMontoTotal() {
		double monto = 0;
		for(int i =0; i < empleados.length; i++) {
			monto += empleados[i].getSalario();
			return monto;
		}
		return monto;
	}
	
	public void listarSalarios() {
		
//		for(int i =0; i < empleados.length; i++) {
//			System.out.println(empleados[i].getSalario());
//			
//		}
		
		for(Empleado e : empleados) {
			System.out.println(e.getSalario()); 
		}
	}
	

	public static void main(String[] args) {
		Empleado luis =  new PlantaTemporal(true, 0, 80);
		Empleado juan =  new PlantaPermanente(true, 2, 80, 6);
		Empleado pepe =  new PlantaPermanente(false, 0, 160, 4);
		Empleado jorge = new Gerente(true, 1, 160, 10);
		
		Empleado[] empleados = {luis, juan, pepe, jorge};
		
		Empresa acme = new Empresa("Acme", 95571793, empleados);
		
		acme.listarSalarios();		
		System.out.print(acme.getMontoTotal());
	}
}

