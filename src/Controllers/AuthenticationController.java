/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import ControllerBase.AuthenticationInterface;
import Utils.EntityWrapper;
import Utils.UserEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.json.JsonObject;

/**
 *
 * @author Abd-Elmalek
 */
public class AuthenticationController implements AuthenticationInterface{
    
    private GsonBuilder gsonBuilder;
    private Gson gson;
    private SocketController socketController;
    private AdapterController adapterController;
    
    
    public AuthenticationController() {
        gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();
        socketController = SocketController.getInstance();
        adapterController=new AdapterController();
        
    }

    @Override
    public void logIn(String username, String password) {
        String userJson = gson.toJson(new EntityWrapper("logIn", "UserEntity", new UserEntity(username, password)));
        socketController.sendJsonObject(userJson);
    }
    
    /*Eman Kamal*/
    @Override
    public void SignUp(UserEntity userEntity) {
       String userJson=adapterController.entity2Json(new EntityWrapper("signup","UserEntity",
               new UserEntity(0, userEntity.getFirstName(), userEntity.getLastName(), userEntity.getUserName(), userEntity.getEmail(), userEntity.getPassword())));
       socketController.sendJsonObject(userJson);
    }    
    /*Eman Kamal*/
}
