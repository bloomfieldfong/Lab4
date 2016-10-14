
/**
 * @author Michelle Bloomfield
 *
 */
public class DriverMilitares {
	public static void main(String[] args){
		Coronel coronel = new Coronel();
		General general = new General();
		Soldado soldado = new Soldado();
		
		System.out.println("Coronel: ");
		coronel.ejecutaOrdenManiobra();
		coronel.toString();
		System.out.println("General: ");
		general.planificaEstrategia();
		general.toString();
		System.out.println("Soldado: ");
		System.out.println("Trabaja un total de: "+soldado.horas()+" horas");
		System.out.println("Tiene un salario de: "+soldado.salario());
		System.out.println("Tiene de vacaciones:"+soldado.vacaciones()+" dias");
		soldado.recibeOrden();
		
	}
	
}
