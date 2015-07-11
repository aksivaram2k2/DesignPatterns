package TemplateMethod;
public class HousingClient {
	public static void main(String args[]) {
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();

		houseType = new GlassHouse();
		houseType.buildHouse();

	}
}
