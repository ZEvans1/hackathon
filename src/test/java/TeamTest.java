import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTeam_instantiatesCorrectly_true() {
        Team testTeam = setUpNewTeam();
        assertEquals(true, testTeam instanceof Team);
    }

    @Test
    public void testTeam_getsProperties() {
        Team testTeam = setUpNewTeam();
        assertEquals("Team1", testTeam.getName());
        assertEquals("A team", testTeam.getDescription());
        assertEquals("Member1", testTeam.getMember());
    }
    //helper
    public Team setUpNewTeam() {
        return new Team("Team1", "A team", "Member1");
    }
}
