package SabanaPayroll;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ColsubsidioFund implements IFamilyCompensationFund {

    private static Map<UUID, Employee> registeredEmployees = new HashMap<>();
    private ArrayList<Employee> employees = new ArrayList<>();

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
        boolean result = false;

        if(employee.getEmployeeMethodPay().equals("commission")) {
            result = true;
        }
        else{
            for(Employee e : employees) {
                if(e.getId() == employee.getId()) {
                    result = true;
                }
            }
        }

        return result == true ? false : employees.add(employee) ;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean result = false;
        int index = 0;

        for(index = 0; index < employees.size(); index++) {
            if(employees.get(index).getId() == id) {
                employees.remove(index);
                result = true;
            }
        }

        return result;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean result = false;
        int index = 0;

        for(index = 0; index < employees.size(); index++) {
            if(employees.get(index).getId() == id) {
                result = true;
            }
        }

        return result;
    }

    @Override
    public String printBenefits() {
        return "By being an affiliate, you are benefited with discounts, programs, credits, information, insurance, " +
                "subsidies and assistance from our workers.";
    }
}
