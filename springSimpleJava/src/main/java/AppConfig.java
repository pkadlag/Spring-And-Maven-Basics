import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.capgemini.repositary.CustomerRepositary;
import com.capgemini.repositary.HibernateCustomerRepositaryImp1;
import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImp1;

@Configuration
@ComponentScan({"com.capgemini"})
public class AppConfig {
	
	//@Bean(name= "customerService")
//public CustomerService getCustomerService()
//{ 
	// CustomerServiceImp1 service = new CustomerServiceImp1(getCustomerRepository() );
	//	CustomerServiceImp1 service = new CustomerServiceImp1();
		//service.setCustomerRepositary(getCustomerRepository());
//return service; 
//}
	
	
	/*@Bean(name="customerRepository")
	public CustomerRepositary getCustomerRepository()
	{
		return new HibernateCustomerRepositaryImp1();
	}
	*/
}
 