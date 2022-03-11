/**
 *
 */
package vn.com.pack.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author TuanTDA
 *
 */
@Mapper
public interface ServiceTypeMapper {

	@Insert("Insert into [Service_Type] values (N'${name}', N'${content}', '${imageUrl}', ${status})")
	boolean insertServiceType(String name, String content, String imageUrl, int status);

}
