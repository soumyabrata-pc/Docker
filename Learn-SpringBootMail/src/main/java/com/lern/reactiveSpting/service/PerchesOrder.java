package com.lern.reactiveSpting.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
@Service("perchaesService")
public class PerchesOrder implements IPerchesOrder {

	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@Override
	public String purches(String[] items, double[] price, String[] email) throws Exception {
	
		//calculate the bill
		double billAmt=0.0;
		for(double p:price)
		billAmt=billAmt+p;
		String msg=Arrays.toString(items)+" with prices"+Arrays.toString(price)+" are purchsed with BillAmount"+billAmt;
		//send mail
		String status=sendMail(msg, email);
		return msg+" ---- >"+status;
	}
	
	private String sendMail(String msg, String[] email)throws Exception {
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message, true);
		helper.setFrom(fromEmail);
		helper.setCc(email);
		helper.setSubject("open it to know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
//		helper.addAttachment("nit.jpg", new ClassPathResource("nit.jpg")); //place nit.jpg file src/main/resource folder
		sender.send(message);
		return "mail sent ";

		//empty email message	
		}
	

}
