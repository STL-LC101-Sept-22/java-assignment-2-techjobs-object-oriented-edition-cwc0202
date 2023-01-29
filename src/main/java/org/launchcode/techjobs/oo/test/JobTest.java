package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job testJob;
    Job testJob2;
    @Before
            public void initializeJobs(){
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId(){
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1, job2);
}
@Test
    public void testJobConstructorSetsAllFields(){
//    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(testJob.getEmployer() instanceof Employer);
    assertTrue(testJob.getName() instanceof String);
    assertTrue(testJob.getLocation() instanceof Location);
    assertTrue(testJob.getPositionType() instanceof PositionType);
    assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    assertEquals(testJob.getEmployer().getValue(), "ACME");
    assertEquals(testJob.getName(), "Product tester");
    assertEquals(testJob.getLocation().getValue(), "Desert");
    assertEquals(testJob.getPositionType().getValue(), "Quality control");
    assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
}
@Test
    public void testJobsForEquality() {
//    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertNotEquals(testJob2, testJob);
}
@Test
    public void testToStringStartsAndEndsWithNewLine(){
//    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(testJob.toString().charAt(0), '\n');
    assertEquals(testJob.toString().charAt(testJob.toString().length() - 1), '\n');
}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
//    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String str = testJob.toString();
    assertTrue(str.contains("ID"));
    assertTrue(str.contains("Name"));
    assertTrue(str.contains("Employer"));
    assertTrue(str.contains("Location"));
    assertTrue(str.contains("Position Type"));
    assertTrue(str.contains("Core Competency"));
    assertTrue(str.contains("Product tester"));
    assertTrue(str.contains("ACME"));
    assertTrue(str.contains("Desert"));
    assertTrue(str.contains("Quality control"));
    assertTrue(str.contains("Persistence"));

}
@Test
    public void testToStringHandlesEmptyField(){
    testJob.setCoreCompetency(null);
    String str = testJob.toString();
    assertTrue(str.contains("Data not available"));
}
}
