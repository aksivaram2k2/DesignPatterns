package ChainofResponsibility;

public class ChainPatternDemo {
	public static void main(String[] args)
	{
		TeamLeader teamLeader = new TeamLeader();
		ProjectLeader projectLead = new ProjectLeader();
		HR hr = new HR();
		teamLeader.setNextSupervisor(projectLead);
		projectLead.setNextSupervisor(hr);
		teamLeader.applyLeave("Raj", 10);
		teamLeader.applyLeave("Raj", 23);
		teamLeader.applyLeave("Raj", 30);
		teamLeader.applyLeave("Raj", 33);
	}
}
