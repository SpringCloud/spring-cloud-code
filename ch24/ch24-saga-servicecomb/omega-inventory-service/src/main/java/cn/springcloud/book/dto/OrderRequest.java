package cn.springcloud.book.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

/**
 * Created by caibosi on 2018-07-29.
 */
@Data
@Builder
public class OrderRequest {

    @Tolerate
    public OrderRequest() {
    }

    private String userId;

    private String productCode;

    private Integer quantity;

    private String txId;
}
