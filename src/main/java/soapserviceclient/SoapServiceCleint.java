
package soapserviceclient;

import java.util.List;
import soap.services.BankUserType;
import soap.services.UserTypesService;


public class SoapServiceCleint {
    
    public static void main(String[] args) {
        
      List<BankUserType> list =  UserTypesService.list();
       
      for (BankUserType bankUserType : list){
      
          System.out.println(bankUserType.getId()+" "+bankUserType.getName());
      }
        
    }
    
}
