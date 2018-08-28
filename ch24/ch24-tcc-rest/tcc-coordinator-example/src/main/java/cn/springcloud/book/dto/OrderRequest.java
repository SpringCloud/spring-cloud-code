package cn.springcloud.book.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by caibosi on 2018-07-27.
 */
@Data
@Builder
public class OrderRequest {

    private String userId;

    private String productCode;

    private Integer quantity;
}
