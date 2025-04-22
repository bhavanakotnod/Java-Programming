
public class Zodiac {
	public static void main(String[] args) {
		
		int day = 4;
		String month = "december";
		
		switch(month) {
		case "january":
			if(day >=1 && day <19) {
				System.out.println("Aquarius");
			}
			else if(day > 20 && day <= 31) {
					System.out.println("Capricorn");
				}
			break;
		case "february":
			if(day >= 1 && day < 19) {
				System.out.println("Aquarius");
			}
			else if(day > 19 && day < 28) {
					System.out.println("Pisces");
				}
			break;
		case "march":
			if(day >= 1 && day <=20) {
				System.out.println("Pisces");
			}
			else if(day >21 && day < 31) {
					System.out.println("Aries");
				}
			break;
		case "april":
			if(day > 1 && day <= 19) {
				System.out.println("Aries");
			}
			else if(day > 20 && day < 30) {
					System.out.println("Taurus");
				}
			break;
		case "may":
			if(day > 1 && day <= 20) {
				System.out.println("Taurus");
			}
			else if(day > 21 && day < 31) {
					System.out.println("Gemini");
				}
			
			break;
		case "june":
			if(day > 1 && day <= 20) {
				System.out.println("Gemini");
			}
				else if(day > 21 && day < 30) {
					System.out.println("Cancer");
				
			}
			break;
		case "july":
			if(day > 1 && day <= 22) {
				System.out.println("Cancer");
			}
			else if(day > 23 && day < 31) {
					System.out.println("Leo");
				}
			break;
		case "august":
			if(day > 1 && day <= 22) {
				System.out.println("Leo");
			}
			else if(day > 23 && day < 31) {
					System.out.println("Virgo");
				}
			break;
		case "september":
			if(day > 1 && day <= 22) {
				System.out.println("Virgo");
			}
			else if(day > 23 && day < 30) {
					System.out.println("Libra");
				}
			break;
		case "octomber":
			if(day > 1 && day <= 22) {
				System.out.println("Libra");
			}
			else if(day > 230 && day < 31) {
					System.out.println("Scorpio");
				}
			break;
		case "november":
			if(day > 1 && day <= 21) {
				System.out.println("Scorpio");
			}
			else if(day > 22 && day < 30) {
					System.out.println("Sgittarius");
				}
			break;
		case "december":
			if(day > 1 && day <= 21) {
				System.out.println("Sagittarius");
			}
			else if(day > 22 && day < 31) {
					System.out.println("Carpicorn");
				}
			break;
			
		}
		
		
	}

}
