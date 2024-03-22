package question1;

import java.util.HashMap;
import java.util.Map;

public class EmployeeAddress {

    public void employeeDetails(){
        Map<Employee, Address> employeeAddressMap = new HashMap<>();
        employeeAddressMap.put(new Employee(1, "Sree"),new Address(101, "kulathoor", "trivandrum", 12345));
        employeeAddressMap.put(new Employee(2, "Akshaya"),new Address(102, "kazhakootam", "trivandrum", 12343));
        employeeAddressMap.put(new Employee(3, "Abhi"),new Address(103, "kunnil", "trivandrum", 12355));
        employeeAddressMap.put(new Employee(4, "Christo"),new Address(104, "kunnil", "trivandrum", 12355));

        Employee employee = new Employee(4, "Christo");
        Address address = getAddress(employeeAddressMap, employee);
        if (address != null) {
            System.out.println(address.getHouseNumber() + "," + address.getStreet() + "," +
                    address.getCity() + "," + address.getPincode());
        } else {
            System.out.println("Address not found for Employee " + employee.getEmployeeId());
        }
    }


    public Address getAddress(Map<Employee, Address> employeeAddressMap, Employee employee) {
        return employeeAddressMap.get(employee);
    }


}
