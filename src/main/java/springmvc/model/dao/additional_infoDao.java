package springmvc.model.dao;

import java.util.List;

import springmvc.model.additional_info;

public interface additional_infoDao 
{
	List<additional_info> getAdditional_info(Integer id);
	
	additional_info saveAdditional(additional_info additional);
	
	additional_info getadditional(Integer id); 

	void delete(additional_info additional_info);

}
