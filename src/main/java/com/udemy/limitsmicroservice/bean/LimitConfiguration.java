package com.udemy.limitsmicroservice.bean;

public class LimitConfiguration {
	private int mininum;
	private int maximum;

	protected LimitConfiguration() {
	}

	public LimitConfiguration(int mininum, int maximum) {
		super();
		this.maximum = maximum;
		this.mininum = mininum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMininum() {
		return mininum;
	}

	public void setMininum(int mininum) {
		this.mininum = mininum;
	}

}
