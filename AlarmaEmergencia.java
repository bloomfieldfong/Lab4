
/**
 * @author Nichelle Bloomfield 16803
 *
 */
public class AlarmaEmergencia extends Alarma{
	
public void m1(){
	System.out.println("Emergencia 1");
}
	
public void m2(){
	super.m1();
	super.m2();
}
public String toString(){
	return "Emergencia "+super.toString();
}
}
