package creationalPatterns.abstractFactory.website;

import creationalPatterns.abstractFactory.Developer;
import creationalPatterns.abstractFactory.ProjectManager;
import creationalPatterns.abstractFactory.ProjectTeamFactory;
import creationalPatterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
