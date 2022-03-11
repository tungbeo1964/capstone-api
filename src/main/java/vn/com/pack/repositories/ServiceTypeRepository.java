/**
 *
 */
package vn.com.pack.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.com.pack.constants.Constant;
import vn.com.pack.dtos.ServiceTypeDTO;
import vn.com.pack.mappers.ServiceTypeMapper;

/**
 * @author TuanTDA
 *
 */
@Repository
public class ServiceTypeRepository {

	@Autowired
	private ServiceTypeMapper serviceTypeMapper;

	public boolean createNewServiceType(ServiceTypeDTO serviceTypeDTO) {
		return serviceTypeMapper.insertServiceType(serviceTypeDTO.getName(), serviceTypeDTO.getContent(),
				serviceTypeDTO.getImageUrl(), Constant.SERVICE_TYPE_IS_ACTIVE);
	}

}
