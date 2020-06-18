package service;

import model.User;

// Type your code
public class AstroCalculator {
//18/06/2020
	public String findSign(User a) {
		String dob = a.getDob();
		String[] dates = dob.split("-");
		int month = Integer.parseInt(dates[0]);
		int date = Integer.parseInt(dates[1]);
		System.out.println(month + " " + date);
		if (month == 12) {
			if (date < 22) {
				return "Sagitarius";
			} else {
				return "Capricorn";
			}

		} else if (month == 01) {
			if (date < 20) {
				return "Capricorn";
			} else {
				return "Aquarious";
			}

		} else if (month == 02) {
			if (date < 19) {
				return "Aquarious";
			} else {
				return "Pisces";
			}

		}

		else if (month == 03) {
			if (date < 21) {
				return "Pisces";
			} else {
				return "Aries";
			}

		}

		else if (month == 04) {
			if (date < 20) {
				return "Aries";
			} else {
				return "Taurus";
			}

		} else if (month == 05) {
			if (date < 21) {
				return "Taurus";
			} else {
				return "Gemini";
			}

		} else if (month == 06) {
			if (date < 21)
				return "Gemini";
			else
				return "Cancer";
		} else if (month == 07) {
			if (date < 2)
				return "Cancer";
			else
				return "Leo";
		} else if (month == 8) {
			if (date < 23)
				return "Leo";
			else
				return "Virgo";
		} else if (month == 9) {
			if (date < 23)
				return "Virgo";
			else
				return "Libra";
		} else if (month == 10) {
			if (date < 23)
				return "Libra";
			else
				return "Scorpio";
		} else {
			if (date < 22)
				return "Scorpio";
			else
				return "Sagitarius";
		}

	}

}