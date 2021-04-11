package SabanaPayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompensarFund implements IFamilyCompensationFund {

    private static List<Employee> registeredEmployees = new ArrayList<>();

    public CompensarFund() {

    }

    /**
     * No permite registrar empleados de tipo EmployeeByHours.
     *
     * @param employee
     * @return
     */
    @Override
    public boolean registerEmployee(Employee employee) {
        boolean result = true;

        if(employee.getEmployeeMethodPay().equals("hours")) {
            result = false;
        }
        else{
            for(Employee e : registeredEmployees) {
                if (e.getId() == employee.getId()) {
                    result = false;
                    break;
                }
            }
        }
        if(result) {
            registeredEmployees.add(employee);
        }

        return result;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean result = false;
        int i = 0;

        for(i = 0; i < registeredEmployees.size(); i++) {
            if(registeredEmployees.get(i).getId() == id) {
                registeredEmployees.remove(i);
                result = true;
                break;
            }
        }

        return result;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean result = false;
        int i = 0;

        for(i = 0; i < registeredEmployees.size(); i++) {
            if(registeredEmployees.get(i).getId() == id) {
                result = true;
                break;
            }
        }

        return result;
    }

    @Override
    public String printBenefits() {
        return "Preferential corporate rates.\n" +
                "Service proposal specific to your needs.\n" +
                "Attention at the headquarters of your company.\n" +
                "Preferential service at 16 Compensar locations.\n" +
                "Wide opening hours.\n" +
                "Model of care authorized by the Ministry of Health with high standards of quality and patient " +
                "safety.\n" +
                "Awareness in vaccination prior to the campaigns.\n" +
                "Provision of certified cold chain equipment.\n" +
                "Access to the portfolio of vaccines delivered by the State.\n" +
                "Information and education to the user during vaccination.\n" +
                "Certified vaccinators with the highest distinction in job skills.\n" +
                "Monitoring and control schemes.\n" +
                "Performance reports.\n" +
                "Individual vaccination certificate.\n" +
                "Accompaniment in adverse events following vaccination.\n" +
                "Agreement modality with monthly billing or advance payment.\n" +
                "Billing of the doses actually applied.\n" +
                "Possibility of access by other interest groups (families) to the entire Compensar vaccine " +
                "portfolio, maintaining the presferential rates.";
    }

}
