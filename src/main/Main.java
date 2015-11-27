package main;
import invetories.Laptop;
import people.QAEngineer;
import people.SoftwareEngineer;


public class Main {

	public static void main(String[] args) {
		QAEngineer mark = new QAEngineer("Mark", "ID1", 32);
		mark.setTotalAbsence(3);
		
		QAEngineer brian = new QAEngineer("Brian", "ID3", 38);
		
		brian.setTotalAbsence(10);
		
		System.out.println(mark.getTotalSalary());
		System.out.println(brian.getTotalSalary());
		
		Laptop asus = new Laptop("Asus", 5000000);
		asus.getName();
		asus.getPrice();
		
		
		boolean isRunning = asus.runApplication("Microsoft Word");
		System.out.println("Is the app running? "+isRunning);
		
		
		isRunning =  asus.runApplication("photoshop");
		System.out.println("Is the app running? "+isRunning);
		
		SoftwareEngineer zen = new SoftwareEngineer("Zaenal", "001", 10, 2015, 4500000);
		System.out.println("Employee Name : " + zen.getName());
		System.out.println("Employee Age  : "+ zen.getAge());
		System.out.println("Basic Salary  : "+ zen.getSalary());
		zen.addNewBugs("OG1", 3);
		zen.addNewBugs("OG2", 5);
		zen.addNewBugs("OG4", 2);
		zen.addNewBugs("OG3", 1);
		System.out.println("Number Of bugsDone : "+ zen.getNumberOfBugs(zen.getList()));
		System.out.println("list Of Bugs : ");
		zen.listAllBugs(zen.getList());
		int score = zen.getTotalScore(zen.getList());
		System.out.println("Score total : " + score);
		System.out.println("Salary "+ zen.getName() + " : "+zen.getSalary(score));
	}
}
