package Homework;

public class Employee {
    private String FIO;
    private String position;
    private int telephone;
    private int salary;
    private int age;


    Employee(String FIO, String position, int telephone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFIO(){
        return FIO;
    }

    public String getPosition(){
        return position;
    }

    public int getTelephone(){
        return telephone;
    }

    public int getSalary(){
        return salary;
    }

    public int getAge(){
        return age;
    }

    public void setFIO(String fio){
        this.FIO = fio;
    }

    public void setPosition(String Position){

        this.position = Position;
    }

    public void setTelephone(int Telephone){
        this.telephone = Telephone;
    }

    public void setSalary(int Salary){
        this.salary = Salary;
    }

    public void setAge(int Age){

        this.age = Age;
    }
    public String task4() {
        return this.FIO + ", his position: " + this.position;
    }

    public String task5() {
        return this.FIO + ", his position: " + this.position + " telephone: " + this.telephone +
                " salary: " + this.salary + " " + this.age + " age";
    }

}
