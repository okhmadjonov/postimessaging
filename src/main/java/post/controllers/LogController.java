package post.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import post.models.Log;
import post.services.LogService;

import java.util.List;
import java.util.Optional;

@Controller
public class LogController {
	

	@Autowired
	private LogService logService;
	
	@GetMapping("/index")
	public String homepage() {
		return "index";
	}
	

    @GetMapping("/getAll")
	@ResponseBody
	public List<Log> getAll(){
	return	logService.getAll();
	}

	@GetMapping(value = "/findbyid/{id}")
	@ResponseBody
	public Optional<Log> getLogById(@PathVariable int id){
		return logService.getLogById(id);
	}

	@PostMapping(value="/addlog")
	public String addLog(@RequestBody Log log){
		logService.addLog(log);
		return "redirect:/index";
	}


}
