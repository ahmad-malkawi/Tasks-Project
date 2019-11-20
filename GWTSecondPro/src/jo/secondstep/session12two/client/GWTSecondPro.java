package jo.secondstep.session12two.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GWTSecondPro implements EntryPoint {
	String[] days;

	public void onModuleLoad() {
		days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		ArrayList<CheckBox> checkBoxs = new ArrayList<CheckBox>();
		HorizontalPanel hPanel = new HorizontalPanel();
		VerticalPanel vPanel = new VerticalPanel();
		for (int i = 0; i < days.length; i++) {
			String day = days[i];
			checkBoxs.add(new CheckBox(day));
			checkBoxs.get(i).ensureDebugId("cwCheckBox-" + day);
			hPanel.setSpacing(10);
			hPanel.add(checkBoxs.get(i));
		}
		vPanel.add(hPanel);
		Button selectAll = new Button("select all");
		vPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		vPanel.add(selectAll);
		RootPanel.get("gwtContainer").add(vPanel);
		
		selectAll.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				for (CheckBox checkBox : checkBoxs) {
					checkBox.setValue(true);
				}
			}
		});

		
	}
}
