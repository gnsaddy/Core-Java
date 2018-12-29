class Animal{
	void move()
	{
		System.out.println("Animal Moving");
	}
}
class Fish extends Animal{
	void move()
	{
		System.out.println("Bird Moving");
	}
}
class Bird extends Animal{
	void move()
	{
		System.out.println("Bird Moving");
	}
}
class SongBird extends Bird{
	void sing()
	{
		System.out.println("Singing Bird");
	}
	
	public static void main(String[] args)
	{
		Animal myAnimal=new SongBird();
		myAnimal.move();
		SongBird sb=(SongBird) myAnimal;
		sb.sing();
		//Bird b=(Bird) myAnimal;
		//b.move();
	}
}
