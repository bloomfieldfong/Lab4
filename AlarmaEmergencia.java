
/**
 * @author Nichelle Bloomfield 16803
 *
 */
public class AlarmaEmergencia extends Alarma{
	
public void m1(){
	System.out.println("Emergencia 1"); //Imprime Emergencia
}
	
public void m2(){
	super.m1(); //Hereda de la clase alarma e imprime "Alarma 1"
	super.m2(); //Hereda de la clase alarma y esta hereda de timbre y esto imprime "Alarma 2"
}
/* (non-Javadoc)
 * @see Alarma#toString()
 */
public String toString(){
	return "Emergencia "+super.toString(); //"Imprime Emergencia ring ring ring ring "
}
}
