package application;

import core.CraftRecipe;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CraftRecipeProperty {
	CraftRecipe craftRecipe;
	IntegerProperty outputIdProperty;
	StringProperty outputNameProperty;
	IntegerProperty outputNumProperty;

	public CraftRecipeProperty(CraftRecipe cr) {
		craftRecipe = cr;
		outputIdProperty = new SimpleIntegerProperty(cr.outputItem.data.id);
		outputNameProperty = new SimpleStringProperty(cr.outputItem.data.getName());
		outputNumProperty = new SimpleIntegerProperty(cr.outputItem.num);
	}

	public IntegerProperty outputIdProperty() {
		return outputIdProperty;
	}

	public StringProperty outputNameProperty() {
		return outputNameProperty;
	}

	public IntegerProperty outputNumProperty() {
		return outputNumProperty;
	}


}
