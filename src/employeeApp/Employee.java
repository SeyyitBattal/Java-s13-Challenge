package employeeApp;

import java.util.Arrays;

public class Employee {

    Long id ;
    String fullName ;
    String email ;
    String password ;
    String[] healthplans ;

    public Employee(Long id, String fullName,String email, String password, String[] healthplans){


        this.id = id ;
        this.fullName = fullName ;
        this.email = email;
        this.password = password ;
        this.healthplans = healthplans ;



    }
    public Long getId (){

        return id ;
    }
    public void setId (Long id ){

        this.id = id ;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){

        this.fullName = fullName ;
    }
    public String getEmail(){
        return email ;
    }
    public void setEmail(String email ){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String[] getHealthplans(){
        return healthplans;
    }
    public void setHealthplans(String[] healthplans){
        this.healthplans=healthplans;
    }

    public void  addHealthplan(int index, String name){
        if (index>=0 && index< healthplans.length) {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println( "index "+index+" has already a name!: ");
            }
        } else {
            System.out.println("Sorry "+index+" is an invalid index!");

        }

    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}