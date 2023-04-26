package com.moohee.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moohee.board.command.BContentCommand;
import com.moohee.board.command.BDeleteCommand;
import com.moohee.board.command.BListCommand;
import com.moohee.board.command.BModifyCommand;
import com.moohee.board.command.BReplyCommand;
import com.moohee.board.command.BWriteCommand;
import com.moohee.board.dao.Constant.Constant;

@Controller
public class BoardController {
	
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	
	@RequestMapping(value = "/")
	public String index() {
		
		return "redirect:list";
	}
	

	@RequestMapping(value = "/write_form")
	public String write_form() {
		
		return "writeForm";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BWriteCommand command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		BListCommand command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	
	@RequestMapping(value = "/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BContentCommand command = new BContentCommand();
		command.execute(model);
		
		return "contentView";
	}
	
	@RequestMapping(value = "/modify_form")
	public String modify_form(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BContentCommand command = new BContentCommand();
		command.execute(model);
		
		return "modifyForm";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BModifyCommand command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BDeleteCommand command = new BDeleteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/reply_form")
	public String reply_form(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BContentCommand command = new BContentCommand();
		command.execute(model);
		
		return "replyForm";
	}
	
	@RequestMapping(value = "/reply")
	public String reply(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BReplyCommand command = new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
}
