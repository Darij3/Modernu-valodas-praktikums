
import java.util.ArrayList;
import java.util.Comparator;

// class employee	  

interface FirmServices {

	double getMaxSalary();
}

class Human {
	protected String name;
	protected String surname;
	protected double salary;

	public Human(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return ("Vards: " + this.getName() + " surname: " + this.getSurname());
	}
}

//employee extended class
class Employee extends Human {

	protected double salary;

	public Employee(String name, String surname, double salary) {

		super(name, surname);
		this.salary = salary;
	}

	
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return (super.toString() + ", salary: " + this.getSalary());
	}

}
class selDesc implements Comparator<Employee> {
	 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Employee a, Employee b)
    {
 
        return (int) (a.salary - b.salary);
    }

//class Firm
class Firm implements FirmServices {
	protected String name;
	//protected Employee[] empl;
	protected int emplAmount = 0;

	public Firm(String name, int maxCount) {
		this.name = name;
		//empl = new Employee[maxCount];
		// this.Employee=Employee;

	}

	public String getName() {
		return name;
	}

	public int getemplAmount() {
		return emplAmount;
	}

	@Override
	public String toString() {
		String out = "Firma: " + this.getName() + " darbnieku daudzums: " + this.getemplAmount() + "\n";

		//for (int i = 0; i < emplAmount; i++)
			//out += (empl[i] + "\n");

		return (out);
	}

	void add(Employee e) {

		try {
			//empl[emplAmount] = new Employee(e);
			emplAmount++;
			// System.out.println(Employee[3]);
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Masivs ir pilns, nevar pievienot lietotaju.");
		}
	}
// Creating an empty ArrayList of Student type


	// maksimala alga.
	public double getMaxSalary() {
		double finalMaxSalary = 0;
		//for (int i = 0; i < emplAmount; i++)
			//if (empl[i].getSalary() > finalMaxSalary)
				//finalMaxSalary = empl[i].getSalary();

		return (finalMaxSalary);
	}
}

public class Collections {
	public static void main(String args[]) {
		Employee John = new Employee("John", "Smith", 1000);
		System.out.println(John);
		Firm VEF = new Firm("Vef", 2);
		System.out.println(VEF);
		//VEF.add(new Employee("Janis", "Jansons", 1700.0));
		//VEF.add(new Employee("Uldis", "Petrovs", 1600.0));
		//VEF.add(new Employee("Janis", " Strods", 1800.0));
		ArrayList<Employee> ar = new ArrayList<Employee>();

		// Adding entries in above List
		// using add() method
		ar.add(new Employee("Janis", "Jansons", 1700.0));
		ar.add(new Employee("Uldis", "Petrovs", 1600.0));
		ar.add(new Employee("Janis", " Strods", 1800.0));

		System.out.println(VEF);
		System.out.println(VEF.getMaxSalary());
	}
}
}