public class Manager extends Employee {
    public Manager(String name, Integer empId, Long salary) {
        super(name, empId, salary);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Manager: ");
        builder.append(name);
        builder.append(",");
        builder.append(empId);

        builder.append("Employees:");

        employees
            .forEach(employee -> {
                builder.append(employeetoString());
            });
        
        return builder.toString();
    
}
