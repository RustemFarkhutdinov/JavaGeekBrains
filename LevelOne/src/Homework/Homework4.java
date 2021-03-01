package Homework;

import java.util.Arrays;

public class Homework4 {

 public static void main(String[] args) {

  Employee employeeOne = new Employee("Петров Иван Иванович", "Уборщик", 431, 152000, 27);
  Employee employeeTwo = new Employee("Наполеон", "Дизайнер", 432, 172000, 31);
  Employee employeeThree = new Employee("Иван Грозный", "Менеджер", 433, 252000, 43);
  Employee employeeFour = new Employee("Кузмич", "Разработчик", 434, 15500, 14);
  Employee employeeFive = new Employee("Печкин", "СИСадмин", 435, 122000, 32);
  Employee employeeSix = new Employee("Алеша Попович", "Тестировщик", 436, 1252000, 85);

  Employee employeeCompany[] = {employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive};


  for (int i = 0; i < employeeCompany.length; i++) {
   if (i < employeeCompany.length) {
    System.out.println(employeeCompany[i].task4());
   }
  }

  System.out.println("------------------------------");

  for (int i = 0; i < employeeCompany.length; i++) {
   if (employeeCompany[i].getAge() < 40) {
    System.out.println(employeeCompany[i].task5());
   }
  }
 }
}