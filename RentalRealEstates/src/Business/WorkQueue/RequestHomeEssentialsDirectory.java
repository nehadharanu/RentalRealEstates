/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author preranagireesh
 */
public class RequestHomeEssentialsDirectory {
    List<RequestHomeEssentials> productRequestList = new ArrayList<RequestHomeEssentials>();

    public List<RequestHomeEssentials> getProductRequestList() {
        return productRequestList;
    }

    public void setProductRequestList(List<RequestHomeEssentials> productRequestList) {
        this.productRequestList = productRequestList;
    }
    
    public void addProductRequest(RequestHomeEssentials productRequest){
        productRequestList.add(productRequest);
    }
    
    public void removeProductRequest(RequestHomeEssentials productRequest){
        productRequestList.remove(productRequest);
    }
    
}
