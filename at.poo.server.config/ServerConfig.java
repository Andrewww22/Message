package at.poo.server.config;

/**
 *
 * @author Andrewww
 *
 * 1.      Realizați o clasă numită at.poo.server.config.ServerConfig (at.poo.server.config este numele pachetului) care are ca rol citirea dintr-un fișier de
 *  configurare a unor parametri, pe care îi vom folosi ulterior în aplicația server. Această clasă trebuie să respecte următoarele constrângeri:
 *
  Clasa trebuie să dispună de doi constructori:
1.       Unul cu un argument de tip String care va reprezenta fișierul de configurare citit
2.       Unul fără argumente, care va considera implicit fișierul de configurare ca fiind server.conf.
  Obiectele de tip ServerConfig trebuie să citească fișierul de configurare și apoi să expună parametrii citiți din fișier prin metode.

  Constructorii din clasa ServerConfig trebuie să arunce excepții dacă apar probleme la citirea sau interpretarea fișierului de configurare:
1.       java.io.IOException dacă fișierul specificat nu există sau nu se poate citi (această excepție este aruncată de către metodele care aparțin claselor de tip stream,
			deci nu este necesară decât aruncarea ei mai departe).
2.       seriaf.poo.server.exceptions.InvalidFormatException dacă cel puțin o linie din fișier nu corespunde formatului așteptat (acest tip de excepție nu există și va trebui creat).
			Daca gasim  o linie care incepecu # indiferent de cate  spatii albe are in fata sa nu arunce exceptia .
3.       seriaf.poo.server.exceptions.UnknownKeyException dacă în fișier există configurată o proprietate necunoscută (acest tip de excepție nu există și va trebui creat).
			Daca contine  = atunci trebuie validata cheia , tinem cheile posibile intr-un hash map.
4.       seriaf.poo.server.exceptions.MissingKeyException dacă din fișier lipsește una din proprietățile așteptate (acest tip de excepție nu există și va trebui creat).
  Clasa trebuie să fie imutabilă.

 *

 *
 */

public class ServerConfig {

	public String fileName;

	public ServerConfig(String fileName)
	{
		this.fileName = fileName;
	}

	public ServerConfig()
	{
		this.fileName = "server.config";
	}

}
