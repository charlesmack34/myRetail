package com.casestudy.target.myretailrestservice.dao;

import com.casestudy.target.myretailrestservice.model.db.ProductPrice;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class ProductMapper implements RowMapper<ProductPrice> {

    @Override
    public ProductPrice mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        return ProductPrice.builder()
                    .productId(resultSet.getLong("product_id"))
                    .price(resultSet.getBigDecimal("price"))
                    .build();

    }

}
