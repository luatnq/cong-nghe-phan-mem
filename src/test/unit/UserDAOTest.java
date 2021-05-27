/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.unit;

import dao.UserDAO;
import junit.framework.Assert;
import model.User;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class UserDAOTest {
    UserDAO userDAO = new UserDAO();
    
    @Test
    public void testCheckLoginException1(){
        User user = new User();
        user.setUsername("luatnq");
        user.setPassword("123");
        boolean isLoginSuccess = userDAO.checkLogin(user);
        Assert.assertNotNull(isLoginSuccess);
        return;
    }
    
    @Test
    public void testCheckLoginException2(){
        User user = new User();
        user.setUsername("xxxxxxxxxxx");
        user.setPassword("xxxxxxxxxxx");
        boolean isLoginSuccess = userDAO.checkLogin(user);
        Assert.assertNotNull(isLoginSuccess);
        return;
    }
    
    @Test
    public void testCheckLoginStandard1(){
        User user = new User();
        user.setUsername("luatbeo");
        user.setPassword("123");
        boolean isLoginSuccess = userDAO.checkLogin(user);
        Assert.assertTrue(isLoginSuccess);
        return;
    }
    
    @Test
    public void testCheckLoginStandard2(){
        User user = new User();
        user.setUsername("hihi");
        user.setPassword("123");
        boolean isLoginSuccess = userDAO.checkLogin(user);
        Assert.assertTrue(isLoginSuccess);
        return;
    }
    
    @Test
    public void testCheckLoginStandard3(){
        User user = new User();
        user.setUsername("hehe");
        user.setPassword("123");
        boolean isLoginSuccess = userDAO.checkLogin(user);
        Assert.assertFalse(isLoginSuccess);
        return;
    }
}
