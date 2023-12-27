package singletonPattern;

public class Accountant {
    private String firstname;
    private String lastname;
    private Integer salary;

    private static Accountant user;

    private Accountant(){

    }
    public void getInfo(){
        System.out.println("fname: ahmed , lastname: ayman , salary: 50k");
    }

    public static Accountant getInstance(){
        if(user == null){
            return new Accountant();
        }
        else{
            return user;
        }

    }

}
