package com.smart.consumption.query.infrastructure.mongo.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.query.domain.models.product.Product;
import com.smart.consumption.query.infrastructure.mongo.entity.ProductEntity;
import com.smart.consumption.query.infrastructure.shared.mapper.GenericMapper;

/**
 * Mapper interface for converting @{@link Product} to @{@link ProductEntity}
 * <p> This interface is used by MapStruct to generate the implementation at compile time </p>
 * @see GenericMapper
 * @see Product
 * @see ProductEntity
 */
@Mapper(componentModel = "spring")
public interface IProductMongoMapper extends GenericMapper<Product, ProductEntity> {

}
   