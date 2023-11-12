package com.example.Currency_Conversion2.Controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Currency_Conversion2.CurrencyExchange;

@RestController
public class CurrencyExchangeController 
{
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValues(@PathVariable String from, @PathVariable String to)
	{
		return new CurrencyExchange(100L,from,to,BigDecimal.valueOf(50L));
	}
}
