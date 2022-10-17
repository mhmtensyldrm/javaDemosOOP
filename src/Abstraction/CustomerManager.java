package Abstraction;
public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
    
}
