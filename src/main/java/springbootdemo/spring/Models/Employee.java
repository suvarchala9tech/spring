package springbootdemo.spring.Models;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    String empid;
    String name;
    String dob;
    String role;
    public Employee(String empid, String name, String dob, String role) {
        this.empid = empid;
        this.name = name;
        this.dob = dob;
        this.role = role;
    }
    @Override
    public String toString() {
        return "Employee [dob=" + dob + ", empid=" + empid + ", name=" + name + ", role=" + role + "]";
    }
    public String getEmpid() {
        return empid;
    }
    public void setEmpid(String empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
}

