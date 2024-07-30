class BookTheaterSeat
{
   static int total_seat = 20;
   static synchronized void bookSeat(int seat)
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
class MyThread1 extends Thread
{
    BookTheaterSeat b; int seat;
    MyThread1( BookTheaterSeat b, int seat)
	{
	    this.b = b;
		this.seat = seat;
	}
    public void run()
    {
         b.bookSeat(seat);
    }
}
class MyThread2 extends Thread
{
    BookTheaterSeat b; int seat;
    MyThread2(BookTheaterSeat b, int seat)
    {
          this.b = b;
          this.seat = seat;
    }
    public void run()
    {
         b.bookSeat(seat);
    }
}
class MovieBookApp
{
    public static void main(String[] args)
    {
          BookTheaterSeat b1 = new BookTheaterSeat();
          MyThread1 t1 = new MyThread1(b1, 7);
		  t1.setName("T1 Thread");
          t1.start();
          
          MyThread1 t2 = new MyThread1(b1, 6);
		  t2.setName("T2 Thread");
          t2.start();

          BookTheaterSeat b2 = new BookTheaterSeat();
          MyThread2 t3 = new MyThread2(b2, 5);
		  t3.setName("T3 Thread");
		  t3.start();
		  
		  MyThread2 t4 = new MyThread2(b2,9);
		  t2.setName("T4 Thread");
		  t4.start();
	 }
}
          		  

