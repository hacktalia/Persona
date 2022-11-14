
public class InformacionMiembrosFamilia {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Persona persona1 = new Persona("Pepito Pérez", 50, "879790F", "hombre", 70.f, 1.80f, 1,
				"Calle Agustino 50, 28002", "Madrid", "Madrid");

		System.out.println(persona1.mostrarInfo());

		System.out.println(persona1.imc());

		Persona persona2 = new Persona("Juanito Pérez", 20, "985674K", "hombre", 60.f, 1.85f, 1,
				"Calle Agustino 50, 28002", "Madrid", "Madrid");

		System.out.println(persona2.mostrarInfo());

		System.out.println(persona2.imc());

		Persona persona3 = new Persona("María Sánchez", 48, "794675E", "mujer", 60.f, 1.79f, 1,
				"Calle Agustino 50, 28002", "Madrid", "Madrid");

		System.out.println(persona3.mostrarInfo());

		System.out.println(persona3.imc());

	}

}
