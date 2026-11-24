package controller;

import com.example.firstteamproject.Navigator;
import com.example.firstteamproject.enums.Screens;
import com.example.firstteamproject.interfaces.BaseController;
import com.example.firstteamproject.models.AppModel;
import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Контроллер для выбора способа заполнения данных
 */
public class WriteMenu implements BaseController {
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
    protected void inputHandDataButtonClick() throws IOException{
        navigator.switchScene(Screens.WRITE_HAND_MENU);
    }

    @FXML
    protected void backMenuButtonClick() throws IOException {
        navigator.switchScene(Screens.MAIN_MENU);
    }

}
