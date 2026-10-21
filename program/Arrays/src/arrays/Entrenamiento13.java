package arrays;

public class Entrenamiento13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nombres= {"Ana", "Guillermo", "Luis", "Marta"};
		String largo=nombres[0];
		for(String nombre:nombres) {
			if(nombre.length()>largo.length()) {
				largo=nombre;
			}
		}
		System.out.println(largo);
	}

}
