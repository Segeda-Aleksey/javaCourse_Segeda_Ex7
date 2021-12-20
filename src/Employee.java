public class Employee extends Person implements Printable, ClickHandler{

    private int idEmp;
    private String EmpName;

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Employee(int idEmp, String empName) {
        this.idEmp = idEmp;
        EmpName = empName;
    }

    @Override
    public String getInfo() {
        return "This is Employee class, idEmp = " + getIdEmp() + " EmpName = " + getEmpName();
    }
}
