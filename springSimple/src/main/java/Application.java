import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImp1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service =new CustomerServiceImp1();
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
