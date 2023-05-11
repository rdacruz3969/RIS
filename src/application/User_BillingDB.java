package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User_BillingDB {
	private StringProperty order_id;
	private StringProperty original_price;
	private StringProperty taxes;
	private StringProperty balance;
	private StringProperty due_date;
	private StringProperty insurance;
	
	public User_BillingDB(String order_id, String original_price, String taxes, String balance, String due_date, String insurance) {
		this.order_id = new SimpleStringProperty(order_id);
		this.original_price = new SimpleStringProperty(original_price);
		this.taxes = new SimpleStringProperty(taxes);
		this.balance = new SimpleStringProperty(balance);
		this.due_date = new SimpleStringProperty(due_date);
		this.insurance = new SimpleStringProperty(insurance);
	}
	
	//Getters
		public String getOrder_id() {return order_id.get();}
		public String getOriginal_price() {return original_price.get();}
		public String getTaxes() {return taxes.get();}
		public String getBalance() {return balance.get();}
		public String getDue_date() {return due_date.get();}
		public String getInsurance() {return insurance.get();}
		
		//Setters
		public void setOrder_id(String value) {order_id.set(value);}
		public void setOriginal_price(String value) {original_price.set(value);}
		public void setTaxes(String value) {taxes.set(value);}
		public void setBalance(String value) {balance.set(value);}
		public void setDue_date(String value) {due_date.set(value);}
		public void setInsurance(String value) {insurance.set(value);}

		//Property Values
		public StringProperty order_idProperty() {return order_id;}
		public StringProperty original_priceProperty() {return original_price;}
		public StringProperty taxesProperty() {return taxes;}
		public StringProperty balanceProperty() {return balance;}
		public StringProperty due_dateProperty() {return due_date;}
		public StringProperty insuranceProperty() {return insurance;}

}
