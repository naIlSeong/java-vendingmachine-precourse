package vendingmachine.model;

import static vendingmachine.validator.ProductValidator.*;

import java.util.HashMap;

// TODO: 2021/12/08 더 좋은 이름
public class ProductList {

	private final HashMap<String, Product> hashMap;

	public ProductList() {
		this.hashMap = new HashMap<>();
	}

	public void init(String rawInput) {
		String[] productRawInputList = rawInput.split(PRODUCT_CRITERIA, -1);
		for (String productRawInput : productRawInputList) {
			String[] arguments = createProductArguments(productRawInput);

			String name = arguments[0];
			int price = Integer.parseInt(arguments[1]);
			int quantity = Integer.parseInt(arguments[2]);

			Product product = new Product(name, price, quantity);
			hashMap.put(name, product);
		}
	}

	private String[] createProductArguments(String productRawInput) {
		String bracketRemovedInput = productRawInput.replace(OPENING_BRACKET, "")
			.replace(CLOSING_BRACKET, "");

		return bracketRemovedInput.split(ARGUMENT_CRITERIA, -1);
	}

}
