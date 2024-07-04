package avlyakulov.timur.mentoring.projects.pet_project_2;

public class ProxyProject implements Project {

    private String url;

    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null)
            realProject = new RealProject(url);
        realProject.run();
    }
}