package com.unlearn.web;

import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.annotation.Resource;

import com.unlearn.domain.Payment;
import com.unlearn.service.PaymentManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/payment/**") //map request to be handled by controller given function. ie create
public class PaymentController {
	
	@Resource(name="paymentManager")
	private PaymentManager paymentManager;
	
	
	@RequestMapping(value="/pay")
	public String addPayment(Model uiModel) {
		return "pay";
	}
	
	@RequestMapping(value="/pay", method=RequestMethod.POST)
	public String addPayment(HttpServletRequest httpServletRequest) {
		
		Payment payment = new Payment();
		payment.setPaymentId(1);
		payment.setBookingId(2);
		payment.setPaymentAmount(Double.valueOf(httpServletRequest.getParameter("price")));
		payment.setPaymentDate(new Date());
		payment.setPaymentTime("10:11:12");
		
		this.paymentManager.makePayment(payment); //calls DatabasePaymentManager to save the payment into the DB
		
		
		// Redirect to avoid double payment!
		return "redirect:/home.htm";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public void showPayment(HttpServletRequest httpServletRequest) {
		List<Payment> test = this.paymentManager.getPayments();
		System.out.println(test); //Just for testing
		
	}
}

//public class PaymentController implements Controller {
//	protected final Log logger = LogFactory.getLog(getClass());
//	
//	private PaymentManager paymentManager;
//	
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		Map<String, Object> myModel = new HashMap<String, Object>();
//		myModel.put("payments", this.paymentManager.getPayments());
//		
//		return new ModelAndView("hello", "model", myModel);
//	}
//
//	public void setPaymentManager(PaymentManager pm) {
//		this.paymentManager = pm;
//	}
//}
