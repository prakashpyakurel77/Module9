package carbuy;

public class CarDealearship {
	    public static void main(String[] args) {
	        Owner owner1 = new Owner("Prakash");
	        Owner owner2 = new Owner("Barsha");

	        Car myToyota = new Toyota("Rav4", 1995, owner1);
	        Car myTesla = new Tesla("Model S", 2024, owner2);

	        Car[] cars = {myToyota, myTesla};

	        for (Car car : cars) {
	            System.out.println(car.getName() + " is owned by " + car.getOwner().getName());
	            car.makeSound(); 
	        }
	    }
	}


/*
 * WE CREATED A GENERAL CLASS CALLED CAR WHICH HAS COMMON PROPERTIES LIKE NAME, YEAR, AND OWNER.
 * WE CREATE TWO SOPECIFIC CAR TESLA AND TOYOTA.
 * THIS LETS US REUSE CIDE ABD BUILD A HIERARCHY WHERE ALL CARS SHARES BASIC TRAITS.
 * 
 * COMPOISTION- EACH CAR HAS AB OWNER WHICH HELPS KEEP CLASSES SEPERATE AND ORGANIZED.
 * 
 * POLYMORPHISM - WE DEFINED AN ABSTRACT METHOD CALLED MAKESOUND() IN THE CAR CLASS, AND TESLA AND TOYOTA PROVIDES
 * ITS OWN VERSION OF METHOD.
 * 
 * 
 */

