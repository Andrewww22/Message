package at.poo.structs;

public class PrivateMessage extends Message
{

	public String receiver;

	public PrivateMessage(String sender, String content, String receiver)
	{
		super(sender,content);//super is always the first line for a constructor of an extended class
		this.receiver = receiver;

	}

	public String toString()
	{
		return "(priv) " +super.toString();//invoching the toString() method of the super class
	}

}
