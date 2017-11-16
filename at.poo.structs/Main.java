package at.poo.structs;

public class Main {

	public static void main(String[] args)
  {
    Message ms1 = new Message("Iustin", "Ce face ba, esti acasa?");
		Message ms2 = new Message("Alina Irimia", "Sunt o vedeta. Admirati.ma !!");
		Message ms3 = new Message("Leopol Costel", "Eu sunt Leopel ... Buna ziua !");

		System.out.println(ms1.toString());
		System.out.println(ms2.toString());
		System.out.println(ms3.toString());
	}

}
