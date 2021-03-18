import java.util.ArrayList;

/**
 * Creates a Hospital System
 * @author Kevin Hogan
 *
 */
public class HospitalSystem {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private static HospitalSystem hospitalSystem;
	
	private HospitalSystem() {}
	
	/**
	 * Creates instance of hospital system.
	 * @return hospital system
	 */
	public static HospitalSystem getInstance() {
		if(hospitalSystem == null) {
			hospitalSystem = new HospitalSystem();
		}
		
		return hospitalSystem;
	}
	
	/**
	 * Adds a patient to the hospital.
	 * @param firstName of the patient.
	 * @param lastName of the patient.
	 * @return the id of the patient.
	 */
	public int addPatient(String firstName, String lastName) {
		int id = patients.size();
		Patient patient = new Patient(id, firstName, lastName);
		patients.add(patient);
		return id;
	}
	
	/**
	 * Gets the patients record.
	 * @param id of the patient.
	 * @return patients record.
	 */
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	
	/**
	 * Adds allergy to patient.
	 * @param id of the patient.
	 * @param allergy of the patient.
	 */
	public void addAllergy(int id, String allergy) {
		Patient patient = patients.get(id);
		patient.addAllergy(allergy);
	}
	
	/**
	 * Get's all the patients data.
	 * @return all the patients data.
	 */
	public String getAllPatientsData() {
		String patientData = new String();
		for(Patient patients : patients) {
			patientData += patients.toString().replace("[", "").replace("]", "") + "\n";
		}
		return patientData;
	}

}
