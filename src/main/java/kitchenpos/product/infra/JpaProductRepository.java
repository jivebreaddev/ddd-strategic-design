package kitchenpos.product.infra;

import kitchenpos.product.domain.Product;
import kitchenpos.product.application.port.out.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaProductRepository extends ProductRepository, JpaRepository<Product, UUID> {
}
