package constructor_overloading;

public class main_clsy
{ 
	public static void main(String[] args)
	{
		book_my_show b1 = new book_my_show(100);
		book_my_show b2 = new book_my_show("GOAT");
		book_my_show b3 = new book_my_show(100,"KALKI");
		book_my_show b4 = new book_my_show("navarang",150);
	}
}