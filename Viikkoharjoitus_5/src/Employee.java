public class Employee {

    private String id;
    private String fname;
    private String lname;
    private float salary;
    private String bdate;
    private String email;
    private String dep;
    private String dname;
    private String phone1;
    private String phone2;
    private String image;

    public Employee(String id, String fname, String lname, float salary, String bdate, String email, String dep, String dname, String phone1, String phone2, String image) {

        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.bdate = bdate;
        this.email = email;
        this.dep = dep;
        this.dname = dname;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public float getSalary() {
        return salary;
    }

    public String getBdate() {
        return bdate;
    }

    public String getEmail() {
        return email;
    }

    public String getDep() {
        return dep;
    }

    public String getDname() {
        return dname;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                ", bdate='" + bdate + '\'' +
                ", email='" + email + '\'' +
                ", dep='" + dep + '\'' +
                ", dname='" + dname + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
