/**
 *
 */
package vn.com.pack.models;

import javax.validation.constraints.NotBlank;

/**
 * @author TuanTDA
 *
 */
public class ServiceTypeModel {

	@NotBlank
	private String name;

	@NotBlank
	private String content;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
