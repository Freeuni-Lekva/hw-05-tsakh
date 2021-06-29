package model;

import java.util.HashMap;

public class AccountManager {
    public static final String attribute = "AccountManager";
    private HashMap<String, String> createdAccounts;

    public AccountManager(){
        createdAccounts = new HashMap<>();
        // by default
        createdAccounts.put("Patrick", "1234");
        createdAccounts.put("Molly", "FloPup");
    }

    public boolean isValidLogin(String username, String password){
        if (!isUsernameInBase(username)) return false;
        String correctPassword = createdAccounts.get(username);
        return correctPassword.equals(password);
    }

    public boolean addNewAccount(String username, String password){
        if (!isUsernameInBase(username)){
            createdAccounts.put(username, password);
            return true;
        }
        return false;
    }

    public boolean isUsernameInBase(String username){
        return createdAccounts.containsKey(username);
    }

}
