
public class NameGenerator {
	
	def static names = ["Emmanuel Christel", "Laure Charline", "Caroline Mayer", "Tim Hubbard", "Arthur Cook", "Daniel Vour"]
	
	def static String newName() {
		int index = Math.random() * 6
		names[index]
	}
	
}
