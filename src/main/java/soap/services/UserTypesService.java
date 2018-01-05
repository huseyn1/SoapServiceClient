
package soap.services;

public class UserTypesService {
    
    public static java.util.List<BankUserType> list (){
        
     UserTypes service = new UserTypes();
    GetUserTypesService port = service.getGetUserTypesServicePort();
    
    return port.list();
    
    }

}

