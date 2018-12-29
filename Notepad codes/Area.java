class Area {
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	void sum(int x,int y,int z) 
	{
		System.out.println(x+y+z);
	}
	public static void main(String[] args)
	{
		Area s=new Area();
		s.sum(20,30);
		s.sum(20,30,40);
	}
}
		