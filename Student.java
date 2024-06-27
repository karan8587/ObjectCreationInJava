/*
 * Write a code in java where you have to name student entry of its name age and address. 
 * Make use of OOPS concept into writing this simple program. 
 */




package oops;

public class Person {
	private String name;
	private int age;
    private Address address;

	Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
	    this.address = address;
	}
	
	public static class Address{
		private String Street;
		private String city;
		private String State;
		private String Zip;
		
		Address(String street, String city,String state,String zip){
			this.Street = street;
			this.city = city;
			this.State = state;
			this.Zip = zip;
		}
	}

	public static void main(String[] args) {
		Address address1 = new Address("181 duke street", "Kitchener", "Ontario", "N2H 0B7");
		Person student1 = new Person("Karan", 30, address1);
		System.out.println("Name : " + student1.name);
		System.out.println("Age : " + student1.age);
        System.out.println("Address: " + student1.address.Street + ", " + student1.address.city + ", " + student1.address.State + " " + student1.address.Zip);
	}

}

