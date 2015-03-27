/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ohtu.App;
import ohtu.data_access.FileUserDao;
import ohtu.domain.User;
import ohtu.io.StubIO;
import ohtu.services.AuthenticationService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evly
 */
public class FileUserDaoTest {
        
    User testuser;
//    AuthenticationService auth;
    FileUserDao dao = new FileUserDao();

    public FileUserDaoTest() {
//        auth = new AuthenticationService(dao);
    }

    @Before
    public void setUp() {
        testuser = new User("pekaani", "salasana1");
//        StubIO io = new StubIO();

//        App app = new App(io, auth);
    }

    @Test
    public void addNewUser() {
        dao.add(testuser);
        String pass = 
        assertEquals("salasana1", pass);
    }
}
