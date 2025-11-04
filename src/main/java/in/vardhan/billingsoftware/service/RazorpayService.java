package in.vardhan.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.vardhan.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {
    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
