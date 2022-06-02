import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Area> areas = new ArrayList<Area>();
		
		areas.add(new Quadrado(5));
		areas.add(new Circulo(5));
		areas.add(new Circulo(10));
		areas.add(new Quadrado(10));
		areas.add(new Triangulo(5, 1.75));
		
		for (Area area : areas) {
			System.out.println(area.area());  
		}
	}

}
