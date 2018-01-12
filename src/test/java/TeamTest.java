import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        assertEquals(null, testTeam.getNewMember());
    }

    @Test
    public void testTeam_addsNewMembers() {
        Team testTeam = setUpNewTeam();
        String newMember = "Member2";
        assertEquals(2, testTeam.addNewMember().size());

    }
    //helper
    public Team setUpNewTeam() {
        return new Team("Team1", "A team", "Member1", new ArrayList<>());
    }
}
