
/**
 * @author Michelle Bloomfield 16803
 *
 */
public class Soldado extends Militar{
	
	/**
	 * @return horas
	 */
	public int horas(){
		return super.getHoras() *2;
	}
	
	/**
	 * @return salario
	 */
	public double salario(){
		return super.getSalario() - 10000;
	}
	
	/**
	 * @return vacacioness
	 */
	public float vacaciones(){
		return super.getDiasVacaciones() / 2;
	}
	
	public void recibeOrden(){
		System.out.println("Ordene mi general");
	}
}
