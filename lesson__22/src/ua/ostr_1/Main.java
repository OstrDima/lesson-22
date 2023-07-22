package ua.ostr_1;

public class Main {

	public static void main(String[] args) {
		Pet cow = () -> "Мууу-Мууу Я корова";
		Pet cat = () -> "Мяууу-Мяууу Я кіт";
		Pet dog = () -> "Гаууу-Гаууу Я пес";

		voice(cow.voice(), "Кора");
		voice(cat.voice(), "Васька");
		voice(dog.voice(), "Сем");
	}

	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name + "!");
	}

}
