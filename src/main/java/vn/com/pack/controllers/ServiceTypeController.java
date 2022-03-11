/**
 *
 */
package vn.com.pack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.com.pack.models.ServiceTypeModel;
import vn.com.pack.services.ServiceTypeService;

/**
 * @author TuanTDA
 *
 */
@RestController
@RequestMapping("/service-type")
public class ServiceTypeController {

	@Autowired
	private ServiceTypeService serviceTypeService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Boolean> createNewServiceType(@RequestBody ServiceTypeModel serviceTypeModel) {
		System.out.println(serviceTypeModel.getName() + " - " + serviceTypeModel.getContent());
		final boolean result = serviceTypeService.createNewServiceType(serviceTypeModel, "");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
