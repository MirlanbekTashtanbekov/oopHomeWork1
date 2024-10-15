public class Employee {

    String name;
    int age;
    int salary;
    int experience;

    public void getAge (){
        if (age<18){
            System.out.println(name+": Не подходит по возрасту");
        }
    }

    public void getSalary (){
        System.out.println(name+": З/П "+salary+" за 3 месяца "+" = "+ (salary*3));
    }

    public void getName (){
       if (experience>5){
            System.out.println("Работник у которого стаж работы больше 5 лет: "+name+" "+experience+ " лет.");
       }
    }


}
