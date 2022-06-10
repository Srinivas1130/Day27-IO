package com.bridgelabz.day27;
import java.util.*;

public class AddressBook10 {
	public static void main(String[] args) {
		System.out.println("Welcome to the Addres Book System");
		Collection<AddressBookUC10> c = new ArrayList<AddressBookUC10>();
		Collection<AddressBookUC10> c1 = new ArrayList<AddressBookUC10>();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int choise;
		do {
			System.out.println("1.CREATE CONTACT");
			System.out.println("2.DISPLAY THE CONTACT");
			System.out.println("3.EDIT THE CONTACT");
			System.out.println("4.DELETE THE CONTACT");
			System.out.println("5.SEARCH THE CONTACT");
			System.out.println("6.DISPLAY NO OF CONTACTS");
			System.out.println("0.EXIT");
			System.out.println("Enter Your choise : ");
			choise = scan1.nextInt();

			switch(choise) {
			case 1:
				System.out.print("Enter First Name : ");
				String firstName = scan.nextLine();
				System.out.print("Enter Last Name : ");
				String lastName = scan.nextLine();
				System.out.print("Enter the Address : ");
				String address = scan.nextLine();
				System.out.print("Enter the State : ");
				String state = scan.nextLine();
				System.out.print("Enter the Zip Code : ");
				int zip = scan1.nextInt();
				System.out.print("Enter the Phone Number : ");
				long phoneNumber = scan1.nextLong();
				Iterator<AddressBookUC10> i = c.iterator();
				while(i.hasNext()) {
					AddressBookUC10 e = i.next();
					if(e.getPhoneNumber() == phoneNumber) {
						System.out.println("Contact is already exist");
						System.out.println("Enter the valid Phone Number : ");
						phoneNumber = scan1.nextLong();
					}
				}
				System.out.print("Enter the Email Address : ");
				String eMail = scan.nextLine();
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				int opt = scan1.nextInt();
				if(opt == 1) {
					c.add(new AddressBookUC10(firstName, lastName, address, state, zip, phoneNumber, eMail));
				}
				if(opt == 2) {
					c1.add(new AddressBookUC10(firstName, lastName, address, state, zip, phoneNumber, eMail));
				}
				break;
			case 2:
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				opt = scan1.nextInt();
				if(opt == 1) {
					i = c.iterator();
					while(i.hasNext()) {
						AddressBookUC10 e = i.next();
						System.out.println(e);
					}
				}
				if(opt == 2) {
					i = c1.iterator();
					while(i.hasNext()) {
						AddressBookUC10 e = i.next();
						System.out.println(e);
					}
				}
				break;
			case 3:
				boolean found = false;
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				opt = scan1.nextInt();
				if(opt == 1) {
					System.out.print("Enter the Phone Number to Edit the contact: ");
					phoneNumber =  scan1.nextLong();
					ListIterator<AddressBookUC10> li =  ((ArrayList<AddressBookUC10>) c).listIterator();
					while(li.hasNext()) {
						AddressBookUC10 e = li.next();
						if(e.getPhoneNumber() == phoneNumber) {
							System.out.print("Enter new First Name : ");
							firstName = scan.nextLine();
							System.out.print("Enter new Last Name : ");
							lastName = scan.nextLine();
							System.out.print("Enter the new Address : ");
							address = scan.nextLine();
							System.out.print("Enter the new State : ");
							state = scan.nextLine();
							System.out.print("Enter the Zip new Code : ");
							zip = scan1.nextInt();
							System.out.print("Enter the new Phone Number : ");
							phoneNumber = scan1.nextLong();
							System.out.print("Enter the new Email Address : ");
							eMail = scan.nextLine();
							System.out.print("1.Book_1 \n 2.Book_2 \n Choose the Address Book : ");
							li.set(new AddressBookUC10(firstName, lastName , address, state, zip, phoneNumber, eMail));
							found = true;
						}
					}
				}
				if(opt == 2) {
					System.out.print("Enter the Phone Number to Edit the contact: ");
					phoneNumber =  scan1.nextLong();
					ListIterator<AddressBookUC10> li =  ((ArrayList<AddressBookUC10>) c1).listIterator();
					while(li.hasNext()) {
						AddressBookUC10 e = li.next();
						if(e.getPhoneNumber() == phoneNumber) {
							System.out.print("Enter new First Name : ");
							firstName = scan.nextLine();
							System.out.print("Enter new Last Name : ");
							lastName = scan.nextLine();
							System.out.print("Enter the new Address : ");
							address = scan.nextLine();
							System.out.print("Enter the new State : ");
							state = scan.nextLine();
							System.out.print("Enter the Zip new Code : ");
							zip = scan1.nextInt();
							System.out.print("Enter the new Phone Number : ");
							phoneNumber = scan1.nextLong();
							System.out.print("Enter the new Email Address : ");
							eMail = scan.nextLine();
							System.out.print("1.Book_1 \n 2.Book_2 \n Choose the Address Book : ");
							li.set(new AddressBookUC10(firstName, lastName , address, state, zip, phoneNumber, eMail));
							found = true;
						}
					}
				}
				if(!found) {
					System.out.println("Record not found");	
				}else {
					System.out.println("Record is Updated successfuly");	
				}
				break;
			case 4:
				found = false;
				System.out.print("1.Book_1 \n2.Book_2 \nChoose the Address Book : ");
				opt = scan1.nextInt();
				if(opt == 1) {
					System.out.print("Enter the Phone Number to Delete : ");
					phoneNumber = scan1.nextLong();
					i = c.iterator();
					while(i.hasNext()) {
						AddressBookUC10 e = i.next();
						if(e.getPhoneNumber() == phoneNumber) {
							i.remove();
							found = true;
						}
					}
				}
				if(opt == 2) {
					System.out.print("Enter the Phone Number to Delete : ");
					phoneNumber = scan1.nextLong();
					i = c1.iterator();
					while(i.hasNext()) {
						AddressBookUC10 e = i.next();
						if(e.getPhoneNumber() == phoneNumber) {
							i.remove();
							found = true;
						}
					}
				}
				if(!found) {
					System.out.println("Record not found");	
				}else {
					System.out.println("Record is deleted successfuly");	
				}
				break;
			case 5:
				found = false;
				System.out.println("Enter the State to search : ");
				state = scan.nextLine();
				i = c.iterator();
				Iterator<AddressBookUC10> i1 = c1.iterator();
				while(i.hasNext() && i1.hasNext()) {
					AddressBookUC10 e = i.next();
					if(e.getState() == state) {
						Hashtable<String, String> dictionary = new Hashtable<String, String>();
						dictionary.put(state, e.getFirstName());
						System.out.println(dictionary);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");	
				}
				break;
			case 6:
				int count = 0;
				i = c.iterator();
				i1 = c1.iterator();
				System.out.print("Enter the Phone Number to find contact : ");
				Long input = scan.nextLong();
				while(i.hasNext()) {
					AddressBookUC10 e = i.next();
					if(e.getPhoneNumber() == input) {
						count++;
						System.out.println(e);
					}
				}
				while(i1.hasNext()) {
					AddressBookUC10 e = i1.next();
					if(e.getPhoneNumber() == input) {
						count++;
						System.out.println(e);
					}
				}
				System.out.println("Number of contacts : "+count);
				break;
			}
		}while(choise != 0);
	}
}
