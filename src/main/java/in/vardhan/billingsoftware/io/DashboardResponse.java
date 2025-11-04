package in.vardhan.billingsoftware.io;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DashboardResponse {
    private Double todaySales;
    private long todayOrderCount;
    private List<OrderResponse> recentOrders;
}
