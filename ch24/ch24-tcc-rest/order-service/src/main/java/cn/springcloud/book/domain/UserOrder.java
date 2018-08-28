package cn.springcloud.book.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by caibosi on 2018-07-27.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "user_order", uniqueConstraints = {@UniqueConstraint(name = "t_order_tx_idx", columnNames = {"txId"})})
@EntityListeners(AuditingEntityListener.class)
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String txId;

    private String userId;

    private String productCode;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private OrderState state;

    private LocalDateTime expireTime;

    @Version
    private Long version;

    @CreatedDate
    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
