package avlyakulov.timur.mentoring.projects.pet_project_2;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/timmawv/JavaLearn");

        project.run();//тепер проєкт буде скачаний тільки при запуску його
    }
}