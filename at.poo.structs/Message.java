package at.poo.structs;

public class Message
{
  public String sender;
	public String content;

	public Message(String sender, String content)
	{
		this.sender = sender;
		this.content = content;
	}

	public String toString()
	{
		return sender+": "+content;

	}
}
