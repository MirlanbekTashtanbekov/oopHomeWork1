import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Employee employee1 = new Employee();
        employee1.name = "Bruno Mars";
        employee1.age = 28;
        employee1.salary = 25000;
        employee1.experience = 3;
        System.out.println("Ф.И.О.: "+employee1.name+"\n"+"Возраст: "+employee1.age+"\n"+"З/П: "+employee1.salary+"\n"+"Стаж: "+employee1.experience+"\n");

        Employee employee2 = new Employee();
        employee2.name = "Lucianno Pavarotti";
        employee2.age = 17;
        employee2.salary = 30000;
        employee2.experience = 7;
        System.out.println("Ф.И.О.: "+employee2.name+"\n"+"Возраст: "+employee2.age+"\n"+"З/П: "+employee2.salary+"\n"+"Стаж: "+employee2.experience+"\n");

        Employee employee3 = new Employee();
        employee3.name = "Leonal Ricci";
        employee3.age = 20;
        employee3.salary = 35000;
        employee3.experience = 8;
        System.out.println("Ф.И.О.: "+employee3.name+"\n"+"Возраст: "+employee3.age+"\n"+"З/П: "+employee3.salary+"\n"+"Стаж: "+employee3.experience+"\n");

        Employee employee4 = new Employee();
        employee4.name = "Bryan Adams";
        employee4.age = 40;
        employee4.salary = 50000;
        employee4.experience = 10;
        System.out.println("Ф.И.О.: "+employee4.name+"\n"+"Возраст: "+employee4.age+"\n"+"З/П: "+employee4.salary+"\n"+"Стаж: "+employee4.experience+"\n");

        Employee employee5 = new Employee();
        employee5.name = "Celina Diona";
        employee5.age = 16;
        employee5.salary = 20000;
        employee5.experience = 4;
        System.out.println("Ф.И.О.: "+employee5.name+"\n"+"Возраст: "+employee5.age+"\n"+"З/П: "+employee5.salary+"\n"+"Стаж: "+employee5.experience+"\n");

        Employee employee6 = new Employee();
        employee6.name = "James Braun";
        employee6.age = 19;
        employee6.salary = 25000;
        employee6.experience = 2;
        System.out.println("Ф.И.О.: "+employee6.name+"\n"+"Возраст: "+employee6.age+"\n"+"З/П: "+employee6.salary+"\n"+"Стаж: "+employee6.experience+"\n");

        Employee employee7 = new Employee();
        employee7.name = "Adrea Bocelli";
        employee7.age = 17;
        employee7.salary = 20000;
        employee7.experience = 2;
        System.out.println("Ф.И.О.: "+employee7.name+"\n"+"Возраст: "+employee7.age+"\n"+"З/П: "+employee7.salary+"\n"+"Стаж: "+employee7.experience+"\n");

        Employee employee8 = new Employee();
        employee8.name = "Enrico Caruzo";
        employee8.age = 24;
        employee8.salary = 35000;
        employee8.experience = 6;
        System.out.println("Ф.И.О.: "+employee8.name+"\n"+"Возраст: "+employee8.age+"\n"+"З/П: "+employee8.salary+"\n"+"Стаж: "+employee8.experience+"\n");

        Employee employee9 = new Employee();
        employee9.name = "Sherloc Holms";
        employee9.age = 25;
        employee9.salary = 35000;
        employee9.experience = 7;
        System.out.println("Ф.И.О.: "+employee9.name+"\n"+"Возраст: "+employee9.age+"\n"+"З/П: "+employee9.salary+"\n"+"Стаж: "+employee9.experience+"\n");

        Employee employee10 = new Employee();
        employee10.name = "Donald Duc";
        employee10.age = 17;
        employee10.salary = 22000;
        employee10.experience = 1;
        System.out.println("Ф.И.О.: "+employee10.name+"\n"+"Возраст: "+employee10.age+"\n"+"З/П: "+employee10.salary+"\n"+"Стаж: "+employee10.experience+"\n");


        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};

        for (Employee employee:employees ) {
            System.out.println("""
                
                Выбор метода:
                1 - по возрасту;
                2 - трех месячная заработная плата;
                3 - стаж работника выше 5 лет;
                """);
            int b = scanner.nextInt();
            switch (b) {
                case 1: {
                    for (int i = 0; i < employees.length; i++) {
                        employees[i].getAge();
                    }break;
                }
                case 2: {
                    for (int i = 0; i < employees.length; i++) {
                        employees[i].getSalary();
                    }break;
                }
                case 3: {
                    for (int i = 0; i < employees.length; i++) {
                        employees[i].getName();
                    }break;
                }
                default:{
                    System.out.println("Error");
                }
            }
        }


    }
}