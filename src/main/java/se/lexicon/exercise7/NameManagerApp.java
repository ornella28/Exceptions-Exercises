package se.lexicon.exercise7;

import java.util.ArrayList;
import java.util.List;

public class NameManagerApp {

    private List<String> names = new ArrayList<>();

    void main(){

        NameManagerApp manager = new NameManagerApp();
        try {
            manager.addName("Alice");
            manager.addName("Bob");
            manager.addName("Alice"); // This will throw DuplicateNameException
        } catch (DuplicateNameException e) {
            System.out.println("Error" + e.getMessage());
        }

        try {
            manager.finddName("Charlie"); // This will throw NameNotFoundException
        }catch (NameNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void addName(String name) throws DuplicateNameException{
        if (names.contains(name)){
            throw new DuplicateNameException("Name already exists: " + name);
        } else {
            names.add(name);
            System.out.println("Name added: " + name);
        }

    }

    public String finddName(String name) throws NameNotFoundException{
        if (!names.contains(name)){
            throw new NameNotFoundException("Name not found: " + name);
        } else {
            return name;
        }
    }
}
