import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		printBonusDatesBetween(2010, 2015);

	}
	
	public static void printBonusDatesBetween(int fromYear, int toYear) {

		String yearTo = Integer.toString(toYear);
		String yearFrom = Integer.toString(fromYear);

		if ((yearTo.length() == 4) && (yearFrom.length() == 4)) {

			for (int i = fromYear; i < toYear; i++) {

				String year = Integer.toString(i);
				String month = year.substring(3, 4) + year.substring(2, 3);
				String day = year.substring(1, 2) + year.substring(0, 1);

				String date = year + "-" + month + "-" + day;

				if (isValidDate(date)) {
					System.out.println(date);
				}
			}
		} else {
			System.out.println("Invalid year input");
		}
	}

	public static boolean isValidDate(String input) {

		String formatString = "yyyy-MM-dd";

		try {
			SimpleDateFormat format = new SimpleDateFormat(formatString);
			format.setLenient(false);
			format.parse(input);

		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
