package people;

import java.util.ArrayList;
import bugs.Bugs;
import java.util.Calendar;

public class SoftwareEngineer extends Employee {
	ArrayList<Bugs> List = new ArrayList<Bugs>();
	Bugs listBugs;
	int age;
	int year;
	int payment;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}	
		
	public long getBonus(){
		long bonus = 0;
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if(currentYear - this.year >= 5){
			bonus = 500000;			
			return bonus;
		}
		return 0;
	}

	public ArrayList<Bugs> getList() {
		return List;
	}

	public void setList(ArrayList<Bugs> list) {
		List = list;
	}

	public SoftwareEngineer(String name, String id) {
		super(name, id);
		//create many more things
		//1-100
	}
	
	public SoftwareEngineer(String name, String id, int age, int year) {
		this(name, id);
		this.age = age;
		this.year = year;
		//1-100
		//101-300
		//do something with age and year
	}
	
	public SoftwareEngineer(String name, String id, int age, int year, int payment) {
		this(name, id, age, year);
		this.age = age;
		this.year = year;
		this.payment = payment;
	}

	public void addNewBugs(String id_bugs, int priority){
		Bugs newBugs = new Bugs(id_bugs, priority);
		List.add(newBugs);
	}
	
	public int getNumberOfBugs(ArrayList<Bugs> list){
		return list.size();
	}
	
	public void listAllBugs(ArrayList<Bugs> list){
		for(int i = 0 ; i < list.size(); i ++){
			listBugs= list.get(i);
			System.out.println ("ID Bugs  : "+ listBugs.getId_Bugs() + " || "+ "Priority : "+ listBugs.getPriority());
		}
	}
	
	public int getTotalScore(ArrayList<Bugs> list){
		int totalScore = 0;
		for(int i = 0 ; i < list.size(); i ++){
			listBugs= list.get(i);
			totalScore = totalScore + listBugs.getScore(listBugs.getPriority());
		}
		return totalScore;
	}
	
	@Override
	public long getSalary() {
		long seSalary = super.getSalary() + 1300000;
		return seSalary;
	}
	

	public long getSalaries(long totalScore) {
		long seSalary = getSalary() + (totalScore*10000);
		return seSalary;
	}
	
	public long totPayment(long totalScore){
		long total = getSalaries(totalScore *10000) + getBonus();
		return total;
	}
}
