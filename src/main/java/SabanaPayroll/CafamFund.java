package SabanaPayroll;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class CafamFund implements IFamilyCompensationFund {

    private Set<Employee> registeredEmployee = new HashSet<Employee>();

    @Override
    public boolean registerEmployee(Employee employee) {
        boolean result = true;

        for(Employee e : registeredEmployee) {
            if(employee.getId() == e.getId()){
                result = false;
                break;
            }
        }
        if(result) {
            registeredEmployee.add(employee);
        }

        return result;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean result = false;

        for(Employee e : registeredEmployee) {
            if(e.getId() == id) {
                registeredEmployee.remove(e);
                result = true;
                break;
            }
        }

        return result;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean result = false;

        for(Employee e : registeredEmployee) {
            if(e.getId() == id) {
                result = true;
                break;
            }
        }

        return result;
    }

    @Override
    public String printBenefits() {
        return "At Cafam we want to offer our affiliates multiple benefits, for this reason, we have designed an " +
                "educational system and plan that offers a wide portfolio of services to our users and companies, so " +
                "that they can access to study certified quality programs, designed to respond to their needs. " +
                "personal, family, work and organizational, with various alternatives of access, prices and subsidies" +
                " according to their income. Through education, together we build a better future!";
    }
}
