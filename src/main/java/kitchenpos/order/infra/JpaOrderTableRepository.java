package kitchenpos.order.infra;

import kitchenpos.order.domain.OrderTable;
import kitchenpos.order.application.port.out.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
