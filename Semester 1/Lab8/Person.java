public class Person {
    private String name;
    private String surname;
    private boolean gender;
    private boolean active;
    public Person(String name, String surname, boolean gender, boolean active) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
    }
    public Person(){
        this.name = "Cirno";
        this.surname = "The Strongest";
        this.gender = true;
        this.active = false;
    }
    public void sleep(){
        if (!isActive())
            System.out.println("I'm sleeping." +
                    ((!getName().equals("Cirno"))? "": " Strongest fairies need strongest sleep!"));
        else
            System.out.println(((!getName().equals("Cirno"))? "I'm not sleeping": "HEY!!! You woke me up! Baka! Baka!"));
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public boolean isGender() {
        return gender;
    }
    public boolean isActive() {
        return active;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setSurname(String newSurname) {
        surname = newSurname;
    }
    public void setGender(boolean newGender) {
        gender = newGender;
    }
    public void setActive(boolean newActive) {
        active = newActive;
    }
}
