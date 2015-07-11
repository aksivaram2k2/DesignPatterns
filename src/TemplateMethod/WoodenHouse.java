package TemplateMethod;
public class WoodenHouse extends HouseTemplate {

	public void buildFoundation()
	{
		System.out.println("Building Foundation with cement");
	}
	
	public void buildPillars()
	{
		System.out.println("Build Pillars with wood coating");
	}
	
	public void buildWalls()
	{
		System.out.println("Build Wooden Walls");
	}
	
	public void buildWindows()
	{
		System.out.println("Build Wooden Windows");
	}
}
