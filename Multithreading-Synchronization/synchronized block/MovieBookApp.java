class BookTheaterSeat
{
   int total_seat = 10;
   
   public void bookSeat(int seat)
   {
        System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
           synchronized(this){
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
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
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
		deepak.setPriority(10);
		deepak.start();
		
		MovieBookApp amit = new MovieBookApp();
		amit.setName("amit");
		amit.setPriority(5);
		amit.seat = 6;
		amit.start();
	 }
}
	  