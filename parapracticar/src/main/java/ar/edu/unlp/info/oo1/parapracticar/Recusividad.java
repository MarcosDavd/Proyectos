package ar.edu.unlp.info.oo1.parapracticar;

public class Recusividad {
	private int max = 12;
	public Recusividad() {
		// TODO Auto-generated constructor stub
	}
	//las variables enviadas al metodo recursivo dentro de el metodo no pueden 
	// ser incrementadas con " X++ "
	//al parecer da un error
	public void recursi(int num){
		if (num <= max ) {
			recursi(num+1);
			System.out.print(num);
		}
	}
	
	
	public boolean tieneComoAncestroA(MAmifero unMamifero) {
		boolean tiene = false;
		//Pregunto di tiene ancestros
		if((this.padre != null)&&(this.madre != null)) {
			//La madre de this es lo que busco ?
			if(this.madre.equals(unMamifero)) {
				// Si lo es temrino la busqueda y retorno true
				tiene = true;
			}else {
				//Si la madre no es ; preginto por el padre 
				if(this.padre.equals(unMamifero)) {
					// Si lo es temrino la busqueda y retorno true
					tiene=true;
				}else {
					//si los padre de this no son lo que busco pregunto por los Abuelos
					// Comienza la busqueda recursiva
					if((tiene = this.madre.tieneComoAncestroA(unMamifero))!= true) {
						tiene = this.padre.tieneComoAncestroA(unMamifero);
					}					
				}
			}
		}
		// si no tiene ancestros retorno false o el resultado de la busqueda
		return tiene;
	}
}
