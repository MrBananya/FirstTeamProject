package controller;

import com.example.firstteamproject.Navigator;
import com.example.firstteamproject.enums.Screens;
import com.example.firstteamproject.interfaces.BaseController;
import com.example.firstteamproject.models.AppModel;
import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Контроллер главного меню
 */
public class MainMenu implements BaseController {
    private AppModel model;
    private Navigator navigator;

    @Override
    public void setModel(AppModel model){
        this.model = model;
    }

    @Override
    public void setNavigator(Navigator navigator){
        this.navigator = navigator;
    }

    @FXML
    protected void writeButtonClick() throws IOException {
        navigator.switchScene(Screens.WRITE_MENU_COOSE);
    }
    @FXML
    protected void readButtonClick() throws IOException{
        navigator.switchScene(Screens.READ_MENU);
    }
}