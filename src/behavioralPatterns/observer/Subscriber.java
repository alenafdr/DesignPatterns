package behavioralPatterns.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.printf("Dear " + name + "we have some changes in vacancies:\n" + vacancies +
        "\n======================================================");
    }
}
