public class EngineerWorker extends Employee {
    private String[] projects;
    public EngineerWorker(){
        super();
        projects = new String[5];
    }
    public EngineerWorker(String name, String surname, boolean gender, boolean active,
                          String position, int payment,
                          int experience, String departament,String[] projects) {
        super(name, surname, gender, active, position, payment, experience, departament);
        this.projects = projects;
    }
    @Override
    public void work() {
        if (isActive()) {
            System.out.println("Don't disturb me! I am working!");
        }
        else {
            System.out.println("I think I deserved some good rest, hehe");
        }
    }
    public void ask(){
        System.out.println("Huh? You want to hear about my projects?...\nSure! I can tell you a bit!");
        String temp = "I am working on ";
        for (int i = 0; i < getProjects().length; i++) {
            if (i<getProjects().length-1){
                temp += getProjects()[i] + ", ";
            }
            else {
                temp += "and " + getProjects()[i];
            }
        }
        System.out.println(temp + "\nPretty cool, if I do say so myself!");
    }
    public String[] getProjects() {
        return projects;
    }
    public void setProjects(String[] projects) {
        this.projects = projects;
    }
}
