import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
    }
    private void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public void setFirstTeam(List<Person> firstTeam) {
        this.firstTeam = firstTeam;
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public void setReserveTeam(List<Person> reserveTeam) {
        this.reserveTeam = reserveTeam;
    }
    public void addPlayer(Person person){
        if(person.getAge() < 40){
            firstTeam.add(person);
        } else{
            reserveTeam.add(person);
        }
    }
}
