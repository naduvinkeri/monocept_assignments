public class Compositeexample {

    Employee developer1 = new Developer("peter", 1, 100L);
    Employee developer2 = new Developer("Sam", 2, 100L);
    Employee developer3 = new Developer("Ryan", 3, 100L);
    Employee developer4 = new Developer("Ryan", 6, 100L);
    Employee developer5 = new Developer("Ryan", 7, 100L);
    Employee lead1 = new Lead("Mike", 4, 200L);
    Employee lead2 = new Lead("Chris", 5, 200L);
    Employee manager = new Manager("will", 8, 5000L);


    lead1.add(developer1);
    lead1.add(developer2);
    lead1.add(developer3);

    System.out.println(lead1.toString());
    lead2.add(developer4);
    System.out.println(lead2.toString());

    manager.add(lead1);
    manager.add(lead2);
    manager.add(developer5);

    System.out.println(manager.toString());

}
