public class Main {
    public static void main(String[] args) {
        IDandPasswords idPass =  new IDandPasswords();

        LoginPage lp = new LoginPage(idPass.getLoginInfo());
    }
}