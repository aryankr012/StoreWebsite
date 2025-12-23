package com.StoreWebsite.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestProductDTO {

	private String name;
	private String brandName;
	private String modelNumber;
	private String description;
	private int quantity;
}
