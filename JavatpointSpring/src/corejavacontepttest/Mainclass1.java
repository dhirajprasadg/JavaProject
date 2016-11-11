package corejavacontepttest;

public class Mainclass1 {

	public static void main(String[] args){
		
		System.out.println(" ----------- Parents Class Example ------------------");
		
		SuperClasssImpl spi = new SuperClasssImpl();
		spi.moneydeposit();
		spi.displaymoney();
		
		System.out.println(" ----------- Abstract Class Example ------------------");
		
		AbstractClassexample abs = new ClassDog();
		abs.animalrun();
		abs.eat(" Bread ");
		
		ClassDog cd = new ClassDog();
		cd.dogspecificmethod();
		
		AbstractClassexample abss = new ClassSnake();
		abss.animalrun();
		abss.eat(" Ants ");
		
		AbstractClassexample.runi();
		
	}
	
}
