package corejava.newfeature.enumtype;

public class EnumExample1 {
	// enum is new type

	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	};

	public enum days {
		SUNDAY(11), MONDAY(5), TUESDAY(8), WEDNESDAY(4);

		private int value;

		private days(int value) {
			this.value = value;
		}

	};

	public static void main(String[] args) {
		System.out.println(Season.FALL);
		for (Season se : Season.values()) {
			System.out.println(" Seasons are : " + se);

		}
		for (days da : days.values()) {
			System.out.println(" Days are : " + da + " // Inserted Value :  "
					+ da.value);
		}
		System.out
				.println(" ---- We can apply Switch statement in enum data type ------- ");

		Season se = Season.SPRING;

		switch (se) {
		case WINTER:
			System.out.println(" It is Winter ");
			break;

		case SPRING:
			System.out.println(" It is spring ");
			break;
		case SUMMER:
			System.out.println(" It is summer ");
			break;
		default:
			System.out.println(" It is default season");

		}
	}

}
