package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Plan plan1 = Plan.CHECKUP;
        Plan plan2 = Plan.SURGERY    ;
        Plan plan3 =Plan.CARDIO;

        String[] healthplans1 = {"name: "+plan1.getName()+" Price: "+plan1.getPrice()};
        String[] healthplans2 = {"name: "+plan2.getName()+" Price: "+plan2.getPrice()};
        String[] healthplans3 = {"name: "+plan3.getName()+" Price: "+plan3.getPrice()};

        Employee employee1 = new Employee(112312L, "Seyyit Battal Arvas", "seyyitbattalarvas3@gmail.com", "121212121212", healthplans1);
        Employee employee2 = new Employee(223423L,"Mauro Icardi", "mauro@icardi.com", "123mauro", healthplans2);
        Employee employee3 = new Employee(3123123L,"Fernando Muslera", "fernando@muslera.com", "123nando", healthplans3);

        employee1.addHealthplan(4, plan1.getName());
        employee2.addHealthplan(2, plan2.getName());
        employee3.addHealthplan(3, plan3.getName());

        String[] developerName = {employee1.getFullName(), employee2.getFullName(), employee3.getFullName()};

        Company company = new Company(132423L,"Galatasaray" , 70000000, developerName);

        company.addEmployee(0,"Wilfred Zaha");
        company.addEmployee(1,"Kerem Aktürkoğlu");
        company.addEmployee(3, "Dries Mertens");

        System.out.println("Healthplan: " + plan1 + " " + plan2 + " " + plan3);
        System.out.println("Employee: " + employee1 + " " + employee2 + " " + employee3);
        System.out.println("Company: " + company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}