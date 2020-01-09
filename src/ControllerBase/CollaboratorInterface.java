/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerBase;

import Entities.UserEntity;

/**
 *
 * @author pc
 */
public interface CollaboratorInterface {
    void addCollaboratorRequest(int collaboratorID, int senderID, int todoId);
    void acceptCollaboratorRequest(int requsetId);
    void rejectCollaboratorRequest(int requestId);
}
