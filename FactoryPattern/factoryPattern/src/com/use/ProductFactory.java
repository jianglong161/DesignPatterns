package com.use;
import java.util.HashMap;
/**
 * 用工厂模式延迟加载的工厂类
 * @author Still2Almost
 *
 */
import java.util.Map;

import com.common.ConcreatorProduect1;
import com.common.Product;
public class ProductFactory {
	private static final Map<String, Product> prMap = new HashMap();
	public synchronized static Product createProduct(String type) throws Exception{
		Product product = null;
		if(prMap.containsKey(type)){
			product = prMap.get(type);
		}else {
			if(type.equals("Product1")){
				product = new ConcreatorProduect1();
			}
			//同时把对象放到缓存容器中
		}
		return product;
	}
	
}
