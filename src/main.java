public class main {
    public static void main(String[] args) {

        Client client = new Client(28, "Alex");
        System.out.println(client.getInfo());
        Employee employee = new Employee(2, "Cot");
        System.out.println(employee.getInfo());

        Client season1 = new Client(01, "new Client");
        System.out.println("Сейчас " + season1.getWinter() + " " + season1.getWinter().getColor());
        System.out.println("Сейчас " + Season.SUMMER + " " + Season.SUMMER.getColor());


    }
}
