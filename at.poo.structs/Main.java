package at.poo.structs;

public class Main
{

	public static void main(String[] args)
  {
    Message ms1 = new Message("Iustin", "Ce face ba, esti acasa?");
		Message ms2 = new Message("Alina Irimia", "Sunt o vedeta. Admirati.ma !!");
		Message ms3 = new Message("Leopol Costel", "Eu sunt Leopel ... Buna ziua !");
    PrivateMessage pvm = new PrivateMessage("Andrei ValBuena", "Buna ziua doamna. Ce mai faceti, sunteti bine ?", "Andreea Pitea" );

    //It doesnt need toString for the printing of the message
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
    System.out.println(pvm);
	}
}
