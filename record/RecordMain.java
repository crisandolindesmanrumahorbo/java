public class RecordMain {
    public static void main(String[] args) {
        EmployeeClass employeeClass = new EmployeeClass("Cris", "123");
        EmployeeRecord employeeRecord = new EmployeeRecord("Cris", "321");

        System.out.println(employeeClass.toString());
        System.out.println(employeeRecord.toString());
    }
}
