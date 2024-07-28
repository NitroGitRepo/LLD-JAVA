class BookTheaterSeat
{
   int total_seat = 10;
   
   synchronized public void bookSeat(int seat)
   {
        if(total_seat>=seat)
		{
		    System.out.println(seat + " seats booked successfully " + Thread.currentThread().getName());
			total_seat = total_seat-seat;
			System.out.println("Seats Left : "+ total_seat);
		}else{
		    System.out.println("Sorry Seats Cannot Be Booked ... !! " +Thread.currentThread().getName());
			System.out.println("Seats Left : "+total_seat);
		}
     }
}
public class MovieBookApp extends Thread
{
    static BookTheaterSeat b;
	int seat;
	public void run()
	{
	   b.bookSeat(seat);
	}
    public static void main(String[] args)
	{ 
	    b = new BookTheaterSeat();
		
	    MovieBookApp deepak = new MovieBookApp();
		deepak.seat = 7;
		deepak.setName("deepak");
		deepak.start();
		
		MovieBookApp amit = new MovieBookApp();
		amit.setName("amit");
		amit.seat = 6;
		amit.start();
	 }
}
	  