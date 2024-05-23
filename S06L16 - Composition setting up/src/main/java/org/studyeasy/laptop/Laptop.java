package org.studyeasy.laptop;

import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class Laptop {

	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;


	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "16GB";
		this.hardDrive = "2TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "Multi Layer";
		this.keyboard = "Backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard, String opticalDrive, String keyboard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop{" +
				"screen=" + screen +
				", processor=" + processor +
				", ram='" + ram + '\'' +
				", hardDrive='" + hardDrive + '\'' +
				", graphicsCard=" + graphicsCard +
				", opticalDrive='" + opticalDrive + '\'' +
				", keyboard='" + keyboard + '\'' +
				'}';
	}
}
