import java.util.ArrayList;
import java.util.List;

public class Lead extends Employee {
    
    private List<Employee> employees = new ArrayList<>();

    public Lead(String nmae, Integer empId, Long salary) { super(name, empId, salary)}

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

        StringBuilder builder = new StringBuilder("Lead: ");
        builder.append(name);
        builder.append(",");
        builder.append(empId);
        
        return builder.toString();
}
