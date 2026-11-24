package controller;

import com.example.firstteamproject.Navigator;
import com.example.firstteamproject.enums.Screens;
import com.example.firstteamproject.interfaces.BaseController;
import com.example.firstteamproject.models.AppModel;
import com.example.firstteamproject.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

/**
 * Контроллер меню для чтения данных
 */
public class ReadMenu implements BaseController {
    private AppModel model;
    private Navigator navigator;

    @FXML ListView<User> userListView;


    @Override
    public void setModel(AppModel model){
        this.model = model;
        if (model.getUsers() != null){
            userListView.setItems(model.getUsers());
        }
        userListView.setPlaceholder(new Label("Список пуст"));
    }

    @Override
    public void setNavigator(Navigator navigator){
        this.navigator = navigator;
    }



    @FXML
    public void backMenuButtonClick() throws IOException {
        navigator.switchScene(Screens.MAIN_MENU);
    }


}
