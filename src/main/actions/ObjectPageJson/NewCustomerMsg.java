package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewCustomerMsg {
	    @SerializedName("customerMustNotBeBlank")
	    @Expose
	    private String customerMustNotBeBlank;

	    public String customerMustNotBeBlank() {
	        return customerMustNotBeBlank;
	    }   
	    
	    @SerializedName("dateMustNotBeBlank")
	    @Expose
	    private String dateMustNotBeBlank;

	    public String dateMustNotBeBlank() {
	        return dateMustNotBeBlank;
	    }   
	    

}
