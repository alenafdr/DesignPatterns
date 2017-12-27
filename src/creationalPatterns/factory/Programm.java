package creationalPatterns.factory;

public class Programm {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else if (speciality.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + "is unknown speciality");
        }
    }
}
