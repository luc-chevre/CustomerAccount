/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author luc.chevre
 */
@ManagedBean(name = "CustomerBean")
@SessionScoped
public class CustomerBean implements Serializable {
    private int currentItem = 0;
    private Services service = new Services();
    private ArrayList<Customer> customers = service.getCustomers();
    
    public String getFirstName(){
        return customers.get(currentItem).getFirstName();
    }

    public int getNumber(){
        return customers.get(currentItem).getNumber();
    }

    public String getLastName(){
        return customers.get(currentItem).getLastName();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    

}
