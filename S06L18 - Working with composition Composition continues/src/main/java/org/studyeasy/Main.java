package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class Main {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		System.out.println(laptop.getProcessor().getBrand());

		Processor p1= new Processor();
		GraphicsCard g1 = new GraphicsCard();

		Laptop l1 = new Laptop(24.0f, p1, "DDR5", "1TB", g1, "Single Layer", "backled");
		System.out.println(l1);


	}

}
