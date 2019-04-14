package vnua.khoaluan.service;

import vnua.khoaluan.bean.Result;
import vnua.khoaluan.entities.Product;
import vnua.khoaluan.form.ProductForm;

public interface IProductService {
    Result getProductByCatalogCode(String  catalogCode, int offset, int limit);

    Result getProductByCatalogCode(String  catalogCode, String textSearch, int offset, int limit);

    Result validateProduct(ProductForm productForm);

    Result validateProductUpdate(ProductForm productForm);
}