package structuralPatterns.flyweight;

import java.util.Map;
import java.util.HashMap;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloeprBySpeciality(String speciality){

        Developer developer = developers.get(speciality);

        if(developer == null) {
            switch (speciality){
                case "java":
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer");
                    developer = new CppDeveloper();
                    break;
            }
        }
        developers.put(speciality, developer);
        return developer;
    }
}
