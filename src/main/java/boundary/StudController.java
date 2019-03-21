package boundary;

import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudController {

	@ReadOnlyProperty
	public String getFirstPage(){
		return "First";
	}


}
