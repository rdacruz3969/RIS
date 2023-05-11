package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Radio_AllAppointDB {
	private final StringProperty patient;
	private final StringProperty modality;
	private final StringProperty date_time;
	private final StringProperty technician;
	private final StringProperty notes;
	
	public Radio_AllAppointDB(String patient, String modality, String date_time, String technician, String notes) {
		this.patient = new SimpleStringProperty(patient);
		this.modality = new SimpleStringProperty(modality);
		this.date_time = new SimpleStringProperty(date_time);
		this.technician = new SimpleStringProperty(technician);
		this.notes = new SimpleStringProperty(notes);
		
	}
	
	//Getters
	public String getPatient() {return patient.get();}
	public String getModality() {return modality.get();}
	public String getDate_time() {return date_time.get();}
	public String getTechnician() {return technician.get();}
	public String getNotes() {return notes.get();}
	
	//Setters
	public void setPatient(String value) {patient.set(value);}
	public void setModality(String value) {modality.set(value);}
	public void setDate_time(String value) {date_time.set(value);}
	public void setTechnician(String value) {technician.set(value);}
	public void setNotes(String value) {notes.set(value);}

	//Property Values
	public StringProperty patientProperty() {return patient;}
	public StringProperty modalityProperty() {return modality;}
	public StringProperty date_timeProperty() {return date_time;}
	public StringProperty technicianProperty() {return technician;}
	public StringProperty notesProperty() {return notes;}
	
}
