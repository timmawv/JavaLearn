package avlyakulov.timur.mentoring.projects.pet_project_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JsonMapperTest {

    private final String rawString = """
            {
              "name": "Timur",
              "year": 22,
              "isAdmin": true
            }
                            """;

    private final User user = new User("Timur", 22, true);

    @Test
    void readFromString_objectWasCreated() {
        User maybeUser = JsonMapper.readFromString(rawString, User.class);

        assertThat(maybeUser).isEqualTo(user);
    }
}