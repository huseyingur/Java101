package MaasHesap;

public class Employee {

String name;
int salary;
int workHours;
int hireYear;

public  Employee(String name, int salary, int workHours, int hireYear ){
    this.name = name;
    this.salary =salary;
    this.workHours =workHours;
    this.hireYear =hireYear;

}

public int tax(){
    if (this.salary <= 1000){return 0;}
    else {return  ((this.salary/100)*3);}

}

public int bonus(){

    if (this.workHours > 40)
         return (this.workHours - 40)*30;

    return 0;
 }

 public int raiseSalary(){

    int workingYears = 2021 - this.hireYear;
    if (workingYears <10 )
        return  (this.salary/100)*5;

    if (workingYears>9 && workingYears<20)
        return (this.salary/100)*10;

    if (workingYears>19)
        return (this.salary/100)*15;

    return this.salary;
}

 public String  toString(){

    System.out.println("Adı: " + this.name);
    System.out.println("Maaşı: " + this.salary);
     System.out.println("Çalışma Saati: " + this.workHours);
     System.out.println("Başlangıç Yılı: " + this.hireYear);
     System.out.println("Vergi " + tax());
     System.out.println("Bonus " + bonus());
     System.out.println("Maaş Artışı " + raiseSalary());
     System.out.println("Vergi ve Bonus sonrası maaş :" + (this.salary-(this.tax())+this.bonus()));
     System.out.println(" Zam Sonrası Maaş: " + (this.salary +  raiseSalary()));
     return "abc" ;

 }


}
