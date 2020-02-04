package observable;

import javafx.scene.text.Text;

public class ObservingText extends Text implements Observer {
	
	@Override
	public void notify(Object data) {
		this.setText((String)data);
	}
}
