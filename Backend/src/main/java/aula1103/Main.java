package aula1103;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args){

        PropertyConfigurator.configure("Backend\\log4j.properties");

        Medicine medicine1 = new Medicine();
        medicine1.setId(1);
        medicine1.setCode(1231423);
        medicine1.setLab("Armadinho Laboratórios");
        medicine1.setName("Rivotril");
        medicine1.setPrice(100.00);
        medicine1.setQuantity(10);


        Medicine medicine2 = new Medicine();
        medicine2.setId(2);
        medicine2.setCode(145235423);
        medicine2.setLab("Junin Laboratórios");
        medicine2.setName("Paroxetina");
        medicine2.setPrice(100.00);
        medicine2.setQuantity(10);


        DAO dao = new MedicineDAO();
        dao.insert(medicine1);
        logger.info("Medicamento registrado: " + medicine1);
        dao.insert(medicine2);
        logger.info("Medicamento registrado: " + medicine2);

        dao.selectAll();
        dao.selectById(2);

    }

}
