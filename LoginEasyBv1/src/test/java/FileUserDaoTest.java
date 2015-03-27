/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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

public class FileUserDaoTest {

//    User testuser;
////    AuthenticationService auth;
//    FileUserDao dao = new FileUserDao();
//    Scanner read;
//
//    public FileUserDaoTest() {
////        auth = new AuthenticationService(dao);
//    }
//
//    @Before
//    public void setUp() throws FileNotFoundException {
//        read = new Scanner("logins.txt");
//        testuser = new User("pekaani", "salasana1");
//        dao.addForTest();
////        StubIO io = new StubIO();
////        App app = new App(io, auth);
//    }
//
//    @Test
//    public void addNewUser() {
//        dao.add(testuser);
//        String pass = "";
//        while (read.hasNextLine()) {
//            pass = read.findInLine("salasana1");
//        }
//        System.out.println("Suppose to be salasana1, gives " + pass);
//        assertEquals("salasana1", pass);
//    }
//
//    @Test
//    public void listUsersRightSizeList() {
//        int size = dao.listAll().size();
//        System.out.println("Suppose to be 2, gives " + size);
//        assertEquals("2", size);
//    }
//
//    @Test
//    public void findByNameExistingUser() {
//        User u = dao.findByName("pekaani");
//        String uname = u.getUsername();
//        System.out.println("Suppose to be pekaani, gives " + uname);
//        assertEquals("pekaani", uname);
//    }
//
//    @Test
//    public void findByNameNonExistingUser() {
//        User u = dao.findByName("pahkina");
//        assertNull(u);
//    }

}
