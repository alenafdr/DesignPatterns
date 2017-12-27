package structuralPatterns.composite;

import java.util.List;
import java.util.ArrayList;

public class Team {
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("team creating project");
        for (Developer developer : developers){
            developer.writeCode();
        }
    }
}
