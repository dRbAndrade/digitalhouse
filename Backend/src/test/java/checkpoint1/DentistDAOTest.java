package checkpoint1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DentistDAOTest {

    @Test
    void testInsertAndSelect(){

        Dentist dentist = new Dentist(0,"Matheus","Andrade");
        DentistDAO dao = new DentistDAO();
        dao.insert(dentist);
        List<Dentist> dentistList = dao.selectAll();
        Dentist dentistFromDB = dao.selectById(dentistList.size());
        assertTrue(dentistList.size()>0);
        assertEquals(dentistList.size(),dentistFromDB.getId());
        assertEquals("Matheus",dentistFromDB.getFirstName());
        assertEquals("Andrade",dentistFromDB.getLastName());

    }
  
}