/**
 *
 */
package vn.com.pack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.pack.dtos.ServiceTypeDTO;
import vn.com.pack.models.ServiceTypeModel;
import vn.com.pack.repositories.ServiceTypeRepository;

/**
 * @author TuanTDA
 *
 */
@Service
public class ServiceTypeService {

	@Autowired
	private ServiceTypeRepository serviceTypeRepository;

	public boolean createNewServiceType(ServiceTypeModel serviceTypeModel, String imageUrl) {
		final ServiceTypeDTO serviceTypeDTO = new ServiceTypeDTO();
		serviceTypeDTO.setName(serviceTypeModel.getName());
		serviceTypeDTO.setContent(serviceTypeModel.getContent());
		serviceTypeDTO.setImageUrl(imageUrl);
		return serviceTypeRepository.createNewServiceType(serviceTypeDTO);
	}

}
