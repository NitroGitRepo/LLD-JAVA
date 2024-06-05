class Case5{

        void show(int a, float b){System.out.println("Integer Float First Method");}
		
		void show(float a, int b){System.out.println("Float Integer Second Method");}
		
		public static void main(String[] args){
		
		        Case5 c = new Case5();
				c.show(10, 20.5f);
				c.show(20.5f, 10);
				c.show(10, 20);
		}
	
}