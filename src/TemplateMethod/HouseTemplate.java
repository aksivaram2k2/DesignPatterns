package TemplateMethod;

public abstract class HouseTemplate 
{

	public final void buildHouse()
	{
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}
	
	public abstract void buildFoundation();
	public abstract void buildPillars();
	public abstract void buildWalls();
	public abstract void buildWindows();
	
}
