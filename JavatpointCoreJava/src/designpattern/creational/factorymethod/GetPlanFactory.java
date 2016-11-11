package designpattern.creational.factorymethod;

public class GetPlanFactory {
	
	public Plan getPlan(String pl) {
		if (pl.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		} else if (pl.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		} else if (pl.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		} else {
			return new DomesticPlan();
		}

	}

}
