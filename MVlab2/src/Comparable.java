//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;
 
// A class 'Employee' that implements Comparable
class Employee implements Comparable<Employee>
{
    private double salary;
    private String name;
    private String surname;
 
    // Used to sort movies by year
    public int compareTo(Employee e)
    {
        return (int) (this.salary - e.salary);
    }
 
    // Constructor
    public Employee(String name, String surname, double salary)
    {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
 
    // Getter methods for accessing private data
    public String getName() { return name; }
    public String getSurname()   {  return surname; }
    public double getSalary()      {  return salary;  }
}
 
// pamata klase
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Jani", "", 2015));
        list.add(new Employee("Uldis", "", 1977));
       
        Collections.sort(list);
 
        System.out.println("Employees after sorting : ");
        for (Employee movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getSurname() + " " +
                               movie.getSalary());
        }
    }
} 