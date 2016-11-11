package corejava.collections.objectshoring;

public class Country implements Comparable {
	String name;
	long population;

	Country(String nam,long pop){
		this.name = nam;
		this.population =pop;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public int compareTo(Object cont) {
		Country co = (Country) cont;
		return this.getName().compareToIgnoreCase(co.getName());
	}

}
