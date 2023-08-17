package com.tech.HsnController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HsnController {
	@RequestMapping("hsn")
	public String hsn() {
		return "hsn/hsn1";
	}
}
