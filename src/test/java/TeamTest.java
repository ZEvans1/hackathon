import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TeamTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTeam_instantiatesCorrectly_true() {
        Team newTeam = setUpNewTeam();
    }

    //helper
    public Team setUpNewTeam() {
        return new Team();
    }
}
