/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerBase;

import Utils.RequestEntity;
import Utils.TaskEntity;
import Utils.UserEntity;

/**
 *
 * @author Abd-Elmalek
 */
public interface TaskInterFace {
    
    boolean assignToTask(int assignerId, int assigneeId);
    boolean updateTaskStatus(TaskEntity task, int status);
    boolean acceptTask(int taskId, int userId);
    boolean rejectTask(RequestEntity taskRequest, UserEntity userEntity);
    boolean withdrawFromTask(TaskEntity task, int userId);
}
