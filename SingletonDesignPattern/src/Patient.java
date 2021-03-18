import java.util.ArrayList;

/**
 * Creates a patient.
 * @author Kevin Hogan
 *
 */
public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies = new ArrayList<String>();
	
	/**
	 * Patient constructor.
	 * @param id of the patient. 
	 * @param firstName of the patient.
	 * @param lastName of the patient.
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Adds allergy to patient.
	 * @param allergy of the patient.
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	
	/**
	 * @return Returns the id, first name, last name, and allergies of the patient.
	 */
	public String toString() {
		return "\nPatient " + (id+1) + " : " + firstName + " " + lastName + "\nAllergies: " + allergies; 
	}

}
