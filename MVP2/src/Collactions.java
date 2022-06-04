
// Importing required classes
import java.io.*;
import java.lang.*;
import java.util.*;
 
//employee class
class Employee {
 
    
    double salary;
    String name, surname;
 
    // Constructor
    public Employee(double salary, String name, String surname)
    {
 
        // This keyword refers to current instance itself
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }
 
    // Method of Employee class
    // To print student details in main()
    public String toString()
    {
 
        // Returning attributes of Employee
        return this.salary + " " + this.name + " "
            + this.surname;
    }
}
 
// comperator
class Sortbyroll implements Comparator<Employee> {
 
    // Method
    // Sorting in ascending order of roll number
    public double compare(Employee a, Employee b)
    {
 
        return a.salary - b.salary;
    }
}
 

class Collactions {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of Employee type
        ArrayList<Employee> ar = new ArrayList<Employee>();
 
        // Adding entries in above List
        // using add() method
        ar.add(new Employee(111, "Mayank", "london"));
        ar.add(new Employee(131, "Anshul", "nyc"));
        ar.add(new Employee(121, "Solanki", "jaipur"));

 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new SalDesc());
 
        // Display message on console for better readability
        System.out.println("\nSorted by salary");
    }
}
