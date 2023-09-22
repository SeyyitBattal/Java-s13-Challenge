package employeeApp;

import java.util.Arrays;

public class Company {
    Long id ;
    String name ;
    int giro ;
    String[] developerNames;

    public Company(Long id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
    public void addEmployee(int index, String name){
        if(index>=0&&index<developerNames.length){

            if(developerNames[index]==null){developerNames[index]=name;}
            else{
                System.out.println("index "+index +" already has a name!");
            }


        }
        else{
            System.out.println("Sorry "+index+" is an invalid index");
        }

    }
}