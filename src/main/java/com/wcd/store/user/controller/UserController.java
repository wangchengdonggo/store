package com.wcd.store.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author PitterWang
 * @create 2019/6/7
 * @since 1.0.0
 */
@RestController
public class UserController {
	@RequestMapping("/home")
	public String home() {

		return "ok";
	}

}