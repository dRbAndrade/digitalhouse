package integrador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        AddressDAO addressDAO = new AddressDAO();
        PatientDAO patientDAO = new PatientDAO();

        for (int i = 0;i<10;i++){
            addressDAO.insert(Address.generateRandomAddress());
            patientDAO.insert(Patient.generateRandomPatient());
        }

        //1. Adicione um paciente com endereço e pesquise no banco de dados pelo ID.
        addressDAO.insert(Address.generateRandomAddress());
        Patient patient = Patient.generateRandomPatient();
        patientDAO.insert(patient);
        JOptionPane.showMessageDialog(null,patient);
        patient = patientDAO.selectById(patientDAO.selectAll().size());
        JOptionPane.showMessageDialog(null,patient);
        //2. Exclua o paciente criado anteriormente e procure-o;
        patientDAO.delete(patient.getId());
        patient = patientDAO.selectById(patient.getId());
        JOptionPane.showMessageDialog(null,patient==null?"Paciente Não existe":patient);
        //3. Pesquise e imprima no console todos os pacientes com seus endereços,
        //serão listados todos os pacientes que incluímos antes de realizar o
        //primeiro teste.
        patientDAO.selectAll().forEach(System.out::println);
    }


}
