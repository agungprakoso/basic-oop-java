package trainingInheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakhlukHidup animal = new MakhlukHidup();
		animal.berkembangbiak();
		animal.bernapas();
		animal.makan();
		
		Sapi a = new Sapi();
		a.berkembangbiak();
		a.bernapas();
		a.makan();
		a.tumbuh();
		
		

		BurungElang b = new BurungElang();
		b.berkembangbiak();
		b.bernapas();
		b.makan();


		Pinguin d = new Pinguin();
		d.berkembangbiak();
		d.bernafas();
		d.makan();
	}


}
