package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExpectedMsg {
	    @SerializedName("customerMustNotBeBlank")
	    @Expose
	    private String customerMustNotBeBlank;

	    public String customerMustNotBeBlank() {
	        return customerMustNotBeBlank;
	    }
	   // 
	    @SerializedName("dateMustNotBeBlank")
	    @Expose
	    private String DateMustNotBeBlank;

	    public String dateMustNotBeBlank() {
	        return DateMustNotBeBlank;
	    }
	    

}
