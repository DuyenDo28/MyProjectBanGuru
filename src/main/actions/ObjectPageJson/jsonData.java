package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class jsonData {
	@SerializedName("NewCustomerMsg")
	@Expose
	private NewCustomerMsg newCustomer;

	public NewCustomerMsg NewCustomerPageJson() {
		return newCustomer;
	}
	
	@SerializedName("ExpectedMsg")
	@Expose
	private ExpectedMsg expectedMsg;

	public ExpectedMsg ExpectedMsgPage() {
		return expectedMsg;
	}

}
