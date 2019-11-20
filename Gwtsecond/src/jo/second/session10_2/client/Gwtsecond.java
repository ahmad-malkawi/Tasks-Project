package jo.second.session10_2.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Gwtsecond implements EntryPoint {
	public void onModuleLoad() {
		ArrayList<CheckBox>Days = new ArrayList<CheckBox>();

		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);



		RootPanel.get("gwtContainer").add(panel);
	}
}