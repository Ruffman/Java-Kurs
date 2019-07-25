package kurs;

class AutoProgramm {

	public static void main(String[] args)
	{
		Auto bmw = new Auto(100, "BMW");
		Auto audi = new Auto(150, "Audi");
		
		bmw.tunen(32);
		audi.tunen(55);
		
		System.out.println(bmw.getLeistung());
		System.out.println(audi.getLeistung());

	}

}
