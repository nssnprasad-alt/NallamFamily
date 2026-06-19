package pojopackages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pojolombok {
	

	
	
	
	private String name ;
	private String gender;
	private String email;
	private String status;

}
