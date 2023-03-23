
public class ConstrWithParam {
	
	int i;
	ConstrWithParam(int x)
	{
		i = x;
	}
	
	void incre()
	{
		i++;
	}
	void display()
	{
		System.out.println(i);
	}
	
	
	public static void main(String []args) {
		ConstrWithParam a1 = new ConstrWithParam(10);
		ConstrWithParam a2 = new ConstrWithParam(10);
		ConstrWithParam a3 = new ConstrWithParam(10);
		a1.incre();
		a1.incre();
		a2=a1;
		a3=a1;
		a1.incre();
		a2.incre();
		a1.display();
		a2.display();
		a3.display();
		
	}

}
