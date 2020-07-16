package com;


public class AppleTest {

	private int weight = 0;
	  private Color color;

	  public AppleTest(int weight, Color green) {
	    this.weight = weight;
	    this.color = green;
	  }

	  public int getWeight() {
	    return weight;
	  }

	  public void setWeight(int weight) {
	    this.weight = weight;
	  }

	  public Color getColor() {
	    return color;
	  }

	  public void setColor(Color color) {
	    this.color = color;
	  }

	  @SuppressWarnings("boxing")
	  @Override
	  public String toString() {
	    return String.format("Apple{color=%s, weight=%d}", color, weight);
	  }
}
