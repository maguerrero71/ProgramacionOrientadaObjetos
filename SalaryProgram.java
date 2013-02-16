
public class SalaryProgram 
{

    public static void main(String[] arguments) {
        int hours, i, j, k;
        double salary;
        int[] arrayHours = new int[2];
        double[] arraySalary = new double[2];
        double[] arrayPay = new double[2];
        for (i = 0; i < arrayHours.length; i++) {
            System.out.println("Digite Las Horas trabajadas del empleado" + i);
            hours = Integer.parseInt(System.console().readLine());
            if (validateHours(hours) == 1) {
                arrayHours[i] = hours;
            } else {
                System.out.println("Error El trabajador debe laborar 40 horas minimo");
                i--;
            }
        }
        for (j = 0; j < arraySalary.length; j++) {
            System.out.println("Digite El salario del empleado" + j);
            salary = Integer.parseInt(System.console().readLine());
            if (validateSalary(salary) == 1) {
                arraySalary[j] = salary;
            } else {
                System.out.println("Error El trabajador debe devengar mas de 8.0");
                i--;
            }
        }
        for (k = 0; k < arrayPay.length; k++) {
            arrayPay = ResolveSalary(arrayHours, arrayPay);
            System.out.println(arrayPay[k]);
        }
    }

    public static int validateHours(int hours) {
        int error = 0;
        if (hours <= 0) {
            return error = 0;
        } else if ((hours >= 40) && (hours <= 60)) {
            return error = 1;
        } else if (hours > 60) {
            System.out.println("Error El trabajador debe laborar mas de una hora");
            return error = 2;
        }
        return error;
    }

    public static int validateSalary(double salary) {
        int error = 0;
        if (salary < 8.0) {
            return error;
        } else {
            return error = 1;
        }
    }

    public static double[] ResolveSalary(int[] hours, double[] salary) {
        int i;
        double[] Totality = new double[2];
        for (i = 0; i < salary.length; i++) {
            Totality[i] = salary[i] * hours[i];
        }
        return Totality;
    }
}
