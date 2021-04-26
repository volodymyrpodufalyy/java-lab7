package com.company;

public class Main {

    public static void main(String[] args) {
	    Parfum parfum = new Parfum();
	    Parfum perfumeEncre = new Parfum("Encre noire", "Encre", 1300, 125);
	    Parfum perfumeGuerlain = new Parfum("Guerlain L'Homme", "Guerlain", 1450, 100,
				new String[]{"citrus"," rosemary", "orange"}, "Wooden",
				"Linda H.", "steel", "male", true);

		System.out.println(perfumeGuerlain.toString());

		perfumeEncre.resetValues("Unique Wood", "Unique", 7643, 150,
				new String[]{"cardamom", "Sichuan pepper"}, "Wooden",
				"TOM FORD", "steel", "female", true);

		System.out.println(perfumeEncre.toString());


		Parfum.printStaticRating();
		perfumeEncre.printRating();

    }
}
