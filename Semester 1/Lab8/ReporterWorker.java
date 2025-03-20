public class ReporterWorker extends Employee{
    private String scoop;
    private String rival;
    public ReporterWorker() {
        super();
        scoop = "";
        rival = "";
    }
    public ReporterWorker(String name, String surname, boolean gender, boolean active,
                    String position, int payment,
                    int experience, String departament,String scoop,String rival) {
        super(name, surname, gender, active, position, payment, experience, departament);
        this.scoop = scoop;
        this.rival = rival;
    }
    @Override
    public void work() {
        if (isActive())
            System.out.println("Greetings, everyone! My name is " + getName()+ " " + getSurname() +
                    "! You knew that? Greetings then.\nRight now I am competing with " + getRival() +
                    " for the best newspaper around!");
        else
            System.out.println("Not feeling like working right now. Maybe " + getRival() + " wins this one...");
    }
    public void news(){
        System.out.println("As a reporter of " + getDepartament() + " Newspaper, I bring today's news!\n" +
                "Today's issue will be about " + getScoop() + "! \nHohoho! Now " + getRival() + " has nothing on it!");
    }
    public String getScoop() {
        return scoop;
    }
    public void setScoop(String scoop) {
        this.scoop = scoop;
    }
    public String getRival() {
        return rival;
    }
    public void setRival(String rival) {
        this.rival = rival;
    }
}
