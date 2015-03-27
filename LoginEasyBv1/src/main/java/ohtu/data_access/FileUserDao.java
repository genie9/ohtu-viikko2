package ohtu.data_access;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ohtu.domain.User;

public class FileUserDao implements UserDao {

    File passwords;
    Scanner reader;
    FileWriter writer;
    User user;
    List<User> users;

    public FileUserDao() {
        passwords = new File("logins.txt");
        try {
            passwords.createNewFile();
            writer = new FileWriter(passwords);
        } catch (IOException ex) {
            Logger.getLogger(FileUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reader = new Scanner(passwords);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> listAll() {
        while (reader.hasNextLine()) {
            users.add(new User(reader.next(), reader.next()));
        }
        return users;
    }

    @Override
    public User findByName(String name) {
        while (reader.hasNextLine()) {
            if (name.equals(reader.findInLine(name))) {
                user = new User(name, reader.next());
                return user;
            }
        }
        return null;
    }

    @Override
    public void add(User user) {

        try {
            String line = user.getUsername() + " " + user.getPassword() + "\n";
            writer.append(line);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addForTest(){
       this.add(new User("jenni", "kahdeksan"));
       this.add(new User("pekka", "saatana!"));
    }
    
    public long fileSize(){
        return passwords.getTotalSpace();
    }
}
