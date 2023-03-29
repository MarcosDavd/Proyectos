package ar.edu.unlp.info.oo1.parapracticar;

public class Maintarea {

	public static void main(String[] args) {
		//*al se puede usar los Tarea().algo.algo porque al devolver un 
		//*objeto se puede acceder por lo connotacion con " . " acceder a cada secciondel objeto
		//* tener en cuanta que se limita a los metodos que devuelven un objeto 
		//* por ej si lo hacemos con un get no se podria hacer si devuelve un tipo <> a obj
		//* al hcaer new Objeto().algo si ya que se hace desde el objeto
		// si se quiere seguir concatenando metodos el actual debe devolver un obj
		// ya que al tner el objeto se puede acceder a el 
		// al paraecer no puedo invocar un metodo que haga alguna tarea diferente a la que se
		//se hace con los set , averiguar su limite y usos
		
		
		//System.out.println(t.toString());
		Recusividad r = new Recusividad();
			r.recursi(0);
	}
	

}
