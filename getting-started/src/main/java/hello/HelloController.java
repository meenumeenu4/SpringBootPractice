/**
 * 
 */
package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bhatiam0
 *
 */

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index(){
		return "Greetings from Spring Boot!";
	}
}
