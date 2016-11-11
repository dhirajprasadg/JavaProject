package designpattern.creational.factorymethod;

abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int unit) {
		System.out.println(" Amount need to be paid : " + rate * unit);
	}

}
