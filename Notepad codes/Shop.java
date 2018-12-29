public class Shop {
                   private
				   int items;
				   String iname;
				   float price;
		void getvalue(int i,String in,int p)
		{
			items=i;
			iname=in;
			price=p;
		}
		void disp()
		{
			System.out.println("Total item is " +items);
			System.out.println("Name of item is " +iname);
			System.out.println("Price of item is " +price);
		}
		
		 public static void main(String[] args)
		 {
			 Shop s=new Shop();
			 s.getvalue(1,"Wheat",45);
			 s.disp();
		 }
}