package behavioralPatterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();

        site.addVacancy("First Java Position");
        site.addVacancy("Second Java Position");

        Observer firstSubscribes = new Subscriber("First subscriber");
        Observer secondSubscribes = new Subscriber("Second subscriber");

        site.addObserver(firstSubscribes);
        site.addObserver(secondSubscribes);

        site.addVacancy("Third Java Position");

        site.removeVacancy("First Java Position");
    }
}
