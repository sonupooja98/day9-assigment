package com.bridglab.addressbook;

import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;


	class Address {

		private static final Logger Log= LogManager.getLogger(addressbook.class);

		private String firstName,lastName, address,city,state,mail ;
		long  zip, phoneNumber;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public long getZip() {
			return zip;
		}

		public void setZip(long zip) {
			this.zip = zip;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public void details() {

			Address obj = new Address();
			Scanner sc = new Scanner(System.in);

			//Taking inputs from user
			Log.info("Enter your name: ");
			obj.setFirstName(sc.nextLine());


			Log.info("Enter your last name: ");
			obj.setLastName(sc.nextLine());

			Log.info("Enter your address: ");
			obj.setAddress(sc.nextLine());

			Log.info("Enter your City: ");
			obj.setCity(sc.nextLine());

			Log.info("Enter your State: ");
			obj.setState(sc.nextLine());

			Log.info("Enter your Mail: ");
			obj.setMail(sc.nextLine());

			Log.info("Enter your Zip: ");
			obj.setZip(sc.nextInt());

			Log.info("Enter your Phone Number: ");
			obj.setPhoneNumber(sc.nextInt());


			//printing users entered values
			Log.info("Your Name is   :"+obj.getFirstName());
			Log.info("Your Last Name :"+obj.getLastName());
			Log.info("Your Name is   :"+obj.getAddress());
			Log.info("Your Name is   :"+obj.getCity());
			Log.info("Your Name is   :"+obj.getState());
			Log.info("Your Name is   :"+obj.getMail());
			Log.info("Your Name is   :"+obj.getZip());
			Log.info("Your Name is   :"+obj.getPhoneNumber());

		}

		public void output() {

			Log.info(getFirstName());
		}

	}
	public class addressbook {
		private static final Logger Log= LogManager.getLogger(addressbook.class);
		public static void main(String[] args) {
			Log.info("Welcome to Address Book Management System");
			Address obj= new Address();
			obj.details();
		}
		
}
