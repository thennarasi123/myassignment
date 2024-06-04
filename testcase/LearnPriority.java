package testcase;

import org.testng.annotations.Test;

public class LearnPriority extends BaseClass1{
  @Test(priority=1)
  public void createLead() {
	  System.out.println("create lead");
  }
  @Test(dependsOnMethods={"testcase.LearnDependency.createLead"})
  public void updateLead() {
	  System.out.println("Update lead");
  }
  @Test(dependsOnMethods={"testcase.LearnDependency.updateLead"})
  public void deleteLead() {
	  System.out.println("delete lead");
  }
}
