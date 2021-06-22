public class Hamster extends Pet implements Vegetarian {
	public String classOfAnimal() {
		return("Hamster");
	}

	@Override
	public  String food() {
		return("beans");
	}
}
