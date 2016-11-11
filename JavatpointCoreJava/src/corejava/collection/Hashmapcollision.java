package corejava.collection;

public class Hashmapcollision {

	public static void main(String[] args) {

		Student st1 = new Student(22, "Dhiraj");
		Student st2 = new Student(22, "Dhiraj");

		System.out.println(" Hash Code of st1 : " + st1.hashCode());

		System.out.println(" Hash Code of st2 : " + st2.hashCode());

		if (st1 == st2) {
			System.out.println(" object are equal using == reference check ");
		} else {
			System.out
					.println(" Two object with same detail have different reference in memory . it is checked by == ");
		}

		if (st1.equals(st2)) {
			System.out.println(" Both object are equal ");
		} else {
			System.out.println(" check equal method result : "
					+ st1.equals(st2));
		}

	}

}
