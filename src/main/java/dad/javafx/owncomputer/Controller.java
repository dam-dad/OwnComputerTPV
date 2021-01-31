package dad.javafx.owncomputer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class Controller implements Initializable {

	// VIEW
	@FXML
	private BorderPane view;
	@FXML
	private Button cpuBTN, motherboardBTN, heatsinkBTN, memoryramBTN, graphiccardBTN, harddiskBTN, accessoriesBTN,
			computerBTN, mountingBTN, addBTN, quantityBTN, deleteBTN, priceBTN, discountBTN, taxesBTN, purchaseBTN;
	@FXML
	private ListView<String> productsLIST;

	// CONSTRUCTOR
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
		loader.setController(this);
		loader.load();
	}

	// INITIALIZE
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	// SHOW VIEW
	public BorderPane getView() {
		return view;
	}

	@FXML
	void onAccesories_Pressed(ActionEvent event) {

	}

	@FXML
	void onCPU_Pressed(ActionEvent event) {

	}

	@FXML
	void onComputer_Pressed(ActionEvent event) {

	}

	@FXML
	void onGraphicCard_Pressed(ActionEvent event) {

	}

	@FXML
	void onHeatSkin_Pressed(ActionEvent event) {

	}

	@FXML
	void onMemory_Pressed(ActionEvent event) {

	}

	@FXML
	void onMotherboard_Pressed(ActionEvent event) {

	}

	@FXML
	void onRAM_Pressed(ActionEvent event) {

	}

	@FXML
	void onMounting_Pressed(ActionEvent event) {

	}

	@FXML
	void applyDiscounts(ActionEvent event) {

	}

	@FXML
	void applyTaxes(ActionEvent event) {

	}

	@FXML
	void changeCuantity(ActionEvent event) {

	}

	@FXML
	void changePrice(ActionEvent event) {

	}

	@FXML
	void onPayAction(ActionEvent event) {

	}

	@FXML
	void removeProduct(ActionEvent event) {

	}
}
