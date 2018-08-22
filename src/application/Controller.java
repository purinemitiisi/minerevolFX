package application;

import java.net.URL;
import java.util.ResourceBundle;

import core.Item;
import core.ItemData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{

	@FXML
	ItemTableController itemTableController;
	@FXML
	CraftTableController craftTableController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		craftTableController.setItemTableController(itemTableController);
	}

    @FXML
    public void onButton() {
    	itemTableController.addItem(new Item(ItemData.WOOD,1));
    }

}
