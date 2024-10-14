package constructor_overloading;

public class book_my_show
{
      public  book_my_show (int a)
      {
    	  System.out.println("book the tickets"+a);
      }
      public book_my_show (String b)
      {
    	  System.out.println("book the tickets with the movie name "+b);
      }
      public  book_my_show (int c,String d)
      {
    	  System.out.println("book the tickets by price and movie name "+c+""+d);
      }
      public  book_my_show (String e,int f)
      {
    	  System.out.println("book the tickets by the threater name and price "+e+""+f);
      }
}