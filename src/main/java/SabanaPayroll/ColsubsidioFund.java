package SabanaPayroll;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ColsubsidioFund implements IFamilyCompensationFund {

    private static Map<UUID, Employee> registeredEmployees = new HashMap<>();

    public ColsubsidioFund() {

    }

    /**
     * No permite registrar empleados de tipo EmployeeByCommission.
     *
     * @param employee
     * @return
     */
    @Override
    public boolean registerEmployee(Employee employee) {
        boolean result = true;

        if(employee.getEmployeeMethodPay().equals("commission")) {
            result = false;
        }
        else{
            for(Employee e : registeredEmployees.values()) {
                if (e.getId() == employee.getId()) {
                    result = false;
                    break;
                }
            }
        }
        if(result) {
            registeredEmployees.put(employee.getId(), employee);
        }

        return result;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean result = false;
        Employee e;

        e = registeredEmployees.get(id);
        result = registeredEmployees.remove(id, e);

        return result;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean result = false;

       result = registeredEmployees.containsKey(id);

        return result;
    }

    @Override
    public String printBenefits() {
        return "By being an affiliate, you are benefited with discounts, programs, credits, information, insurance, " +
                "subsidies and assistance from our workers.";
    }
}
