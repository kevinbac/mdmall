package com.mdmall.service;

import com.mdmall.common.ServerResponse;
import com.mdmall.pojo.User;

/**
 * Created by Administrator on 2017/5/27.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String str,String type);
    ServerResponse selectQuestion(String username);
    ServerResponse<String> checkAnswer(String username,String question,String answer);
    ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken);
    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);
    ServerResponse<User> updateInformation(User user);
    ServerResponse<User> getInformation(Integer userId);
}
