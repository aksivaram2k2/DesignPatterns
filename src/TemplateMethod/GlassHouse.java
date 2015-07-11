package TemplateMethod;
public class GlassHouse extends HouseTemplate {

	public void buildFoundation()
	{
		System.out.println("Building Foundation with cement");
	}
	
	public void buildPillars()
	{
		System.out.println("Build Pillars with glass coating");
	}
	
	public void buildWalls()
	{
		System.out.println("Build Glass Walls");
	}
	
	public void buildWindows()
	{
		System.out.println("Build Glass Windows");
	}
}
