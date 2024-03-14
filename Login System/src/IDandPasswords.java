import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    public IDandPasswords(){
        loginInfo.put("Christian", "cars");
        loginInfo.put("Alex", "art");
        loginInfo.put("Dad", "bike");

    }


    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
