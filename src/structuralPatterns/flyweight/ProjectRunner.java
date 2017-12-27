package structuralPatterns.flyweight;

import java.util.List;
import java.util.ArrayList;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloeprBySpeciality("java"));
        developers.add(developerFactory.getDeveloeprBySpeciality("java"));
        developers.add(developerFactory.getDeveloeprBySpeciality("java"));
        developers.add(developerFactory.getDeveloeprBySpeciality("java"));
        developers.add(developerFactory.getDeveloeprBySpeciality("java"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
        developers.add(developerFactory.getDeveloeprBySpeciality("c++"));
    }
}
