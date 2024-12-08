public class Employee extends Person {
    private String position;
    private int payment;
    private int experience;
    private String departament;
    public Employee() {
        super();
        this.position = "";
        this.payment = 0;
        this.experience = 0;
        this.departament = "";
    }
    //is this supposed to be that long??????? I don't understand, maybe I am doing something wrong
    public Employee(String name, String surname, boolean gender, boolean active,
                    String position, int payment,
                    int experience, String departament) {
        super(name, surname, gender, active);
        this.position = position;
        this.payment = payment;
        this.experience = experience;
        this.departament = departament;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getPayment() {
        return payment;
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String getDepartament() {
        return departament;
    }
    public void setDepartament(String departament) {
        this.departament = departament;
    }
    @Override
    public void sleep(){
        if (!isActive()) {
            System.out.println("I'm sleeping, but I will need to work anyways...");
        }
        else
            System.out.println("I am not sleeping... Probably working");
    }
    public void work(){
        if (!isActive()) {
            System.out.println("I am not working right now...");
        }
        else
            System.out.println("I am working currently");
    }
}
