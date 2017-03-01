class Temperature {
  
  private ArrayList<Patient> list_patients = new ArrayList<>();
  private ArrayList<Double> list_temp = new ArrayList<>();

  Temperature(ArrayList<Patients> patients) {
    list_patients = patients;
  }

  // assume don't know the patient temp beforehand
  void load_temp() {
    for (int i = 0; i < list_patients.size(); i++)
      list_temp.add(list_patients.get(i).temp);
  }

  double get_temp(Patient p) {
    return p.temp;
  }

  void update_patient(Patient newPatient) {
    /* update new patient to arraylist */

  }

  void convert_temp() {
    /* formula */

  }

  boolean isSick(Patient p) {
    return (p.temp > 40 ? true : false);
  }

}
