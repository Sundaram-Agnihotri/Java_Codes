package org.studyeasy.laptop.components;

public class Processor {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxfrequency;

	public Processor() {
		this.brand = "Intel";
		this.series = "11000u";
		this.generation = 11;
		this.cores = 4;
		this.threads = 4;
		this.cacheMemory = "5 MB";
		this.frequency = "2.5GHZ";
		this.minFrequency = "2.4GHZ";
		this.maxfrequency = "3.1GHZ";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency, String minFrequency, String maxfrequency) {
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxfrequency = maxfrequency;
	}

	@Override
	public String toString() {
		return "Processor{" +
				"brand='" + brand + '\'' +
				", series='" + series + '\'' +
				", generation=" + generation +
				", cores=" + cores +
				", threads=" + threads +
				", cacheMemory='" + cacheMemory + '\'' +
				", frequency='" + frequency + '\'' +
				", minFrequency='" + minFrequency + '\'' +
				", maxfrequency='" + maxfrequency + '\'' +
				'}';
	}
}
