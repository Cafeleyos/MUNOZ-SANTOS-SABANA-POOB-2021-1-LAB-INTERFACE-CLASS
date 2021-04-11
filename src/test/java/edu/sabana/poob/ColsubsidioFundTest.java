package edu.sabana.poob;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import SabanaPayroll.*;
import static org.junit.jupiter.api.Assertions.*;

public class ColsubsidioFundTest {

    private static Faker faker;

    private static List<Employee> employees;
    private static Department department;

    private static EmployeeForSalary EmployeeForSalary;
    private static EmployeeForHours EmployeeForHours;
    private static EmployeeForCommission EmployeeForCommission;

    private static IFamilyCompensationFund colsubsidioFund;

    @BeforeAll
    public static void setUp() {
        faker = new Faker(new Locale("en-US"));

        department = new Department("Engineering");

        EmployeeForSalary = new EmployeeForSalary(faker.name().firstName(), faker.name().lastName(), department, 1000000);
        EmployeeForHours = new EmployeeForHours(faker.name().firstName(), faker.name().lastName(), department, 40);
        EmployeeForCommission = new EmployeeForCommission(faker.name().firstName(), faker.name().lastName(), department, 100);

        employees = new ArrayList<>();
        employees.add(EmployeeForSalary);
        employees.add(EmployeeForHours);
        employees.add(EmployeeForCommission);

        colsubsidioFund = new ColsubsidioFund();
    }

    @Test
    @DisplayName("GIVEN a employee by salary WHEN try to register THEN success")
    public void shouldRegisterEmployee() {

        assertTrue(colsubsidioFund.registerEmployee(EmployeeForSalary));
    }

    @Test
    @DisplayName("GIVEN a employee by commission WHEN try to register THEN fails")
    public void shouldNotRegisterEmployeeWhenByCommission() {

        assertFalse(colsubsidioFund.registerEmployee(EmployeeForCommission));
    }

    @Test
    @DisplayName("GIVEN a employee by salary registered WHEN try to register again THEN fails")
    public void shouldNotRegisterEmployeeWhenDuplicated() {

        assertTrue(colsubsidioFund.registerEmployee(EmployeeForSalary));
        assertFalse(colsubsidioFund.registerEmployee(EmployeeForSalary));
    }

    @Test
    @DisplayName("GIVEN a employee by salary registered WHEN try to delete THEN success")
    public void shouldDeleteEmployee() {

        assertTrue(colsubsidioFund.registerEmployee(EmployeeForSalary));
        assertTrue(colsubsidioFund.deleteEmployee(EmployeeForSalary.getId()));
    }

    @Test
    @DisplayName("GIVEN a employee by salary not registered WHEN try to delete THEN fails")
    public void shouldNotDeleteEmployee() {

        assertFalse(colsubsidioFund.deleteEmployee(EmployeeForSalary.getId()));
    }

    @Test
    @DisplayName("GIVEN a employee by salary registered WHEN try to validate is registered THEN success")
    public void shouldValidateEmployeeIsRegistered() {

        assertTrue(colsubsidioFund.registerEmployee(EmployeeForSalary));
        assertTrue(colsubsidioFund.isEmployeeRegistered(EmployeeForSalary.getId()));
    }

    @Test
    @DisplayName("GIVEN a employee by salary not registered WHEN try to validate is registered THEN fails")
    public void shouldNotValidateEmployeeIsRegistered() {

        assertFalse(colsubsidioFund.isEmployeeRegistered(EmployeeForSalary.getId()));
    }

    @Test
    public void shouldPrintBenefits() {

        String benefits = colsubsidioFund.printBenefits();
        assertNotNull(benefits);
    }

}
