package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {
                new EmployeePayrollData(1, "Swapnil", 10000.0),
                new EmployeePayrollData(2, "Shubham", 20000.0),
                new EmployeePayrollData(3, "Kunal", 30000.0)
        };
        EmployeePayrollService employeePayRollService;          //uc3 save the details in a file --open terminal enter->> more payroll-file.txt
        employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayRollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
        employeePayRollService.printData(EmployeePayrollService.IOService.FILE_IO);
        System.out.println("Number of employee payroll service entries are: " + entries);
    }
}