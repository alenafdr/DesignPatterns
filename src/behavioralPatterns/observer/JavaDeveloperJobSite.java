package behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribes = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob: subscribes){
            ob.handleEvent(vacancies);
        }
    }
}
