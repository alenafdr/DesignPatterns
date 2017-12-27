package creationalPatterns.abstractFactory.banking;

import creationalPatterns.abstractFactory.Developer;
import creationalPatterns.abstractFactory.ProjectManager;
import creationalPatterns.abstractFactory.ProjectTeamFactory;
import creationalPatterns.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
