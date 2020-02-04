package observable;

public class Controller {

	private Model model;
	private int index;
	final private String[] messagelist = { "Hallo, dit is het eerste bericht uit de lijst.",
			"Vakantie", "Huiswerk maken", "naar de Kroeg", "Groetjes",
			"Opa en Oma een kaart sturen", "Credits aan Jantien geven!",
			"nu eindelijk echt aan mijn huiswerk beginnen!", "Enjoy yourself",
			"Biertje drinken met Kenneth!", "YEET!",
			"passive agrresive postIT notes", "Kom maar door!", "Dat is zo!",
			"Weird flex but OK" };
	
	public Controller(Model model) {
		this.index = 0;
		this.model = model;
	}

	public void bindText(Observer observer) {
		this.model.observe(observer);
		this.model.push("unknown");
	}

	public void push() {
		model.push(messagelist[index]);
		index++;
		index %= messagelist.length;
	}

}
