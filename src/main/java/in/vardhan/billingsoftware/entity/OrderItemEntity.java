package in.vardhan.billingsoftware.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(
        name = "tbl_order_items",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"order_id", "itemId"})})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemId;
    private String name;
    private Double price;
    private Integer quantity;
}
