package src.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Data
@Getter
@Setter
public class CustomerOrderVO {
	private int orderId;
	private String customerId;
	private int basketId;
	private Date orderInputDate;
	private Date orderUpdateDate;
	private Date orderEndDate;
	private Date orderDeleteDate;
	private String orderStatusId;

}
