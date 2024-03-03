package StudentExample;

import java.util.*;

public class Salary {
    public static double yearlySalary(double weeklyHour, double hourlyWage, double vacationDays) {
        double employeeSalary;
        if ((weeklyHour <=0) || (hourlyWage <=0)) {
            employeeSalary = 0;
        } else {
            employeeSalary = hourlyWage * (weeklyHour * (365 / 7) - vacationDays * 8);
        }
        return employeeSalary;
    }
}
