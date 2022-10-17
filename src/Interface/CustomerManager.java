package Interface;

public class CustomerManager {
    ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void Add(){
        //Islemler
        //Islemler
        //Islemler
        customerDal.Add();
    }
    
}
