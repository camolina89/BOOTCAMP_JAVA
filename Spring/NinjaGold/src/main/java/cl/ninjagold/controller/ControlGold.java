package cl.ninjagold.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlGold {

	@GetMapping({"/Gold", "/"})
	public String gold(HttpSession sesion) {
		
		if(sesion.getAttribute("suma") ==null) {
			sesion.setAttribute("suma",0);
		}
		if(sesion.getAttribute("lista") ==null) {
			ArrayList<String> listSesion= new ArrayList<String>();
			sesion.setAttribute("lista", listSesion);
		}
		return "index";
	}

	@PostMapping("/Gold")
	public String findGold(HttpSession sesion,@RequestParam int oro) {
		LocalDateTime fecha = LocalDateTime.now();
		DateTimeFormatter formFecha = DateTimeFormatter.ofPattern("d MMMM YYYY kk:mm a");
		String fechaFormateada =fecha.format(formFecha);
		int numRandom=0;
		
		int suma = (int) sesion.getAttribute("suma");
		List<String> reg = (List<String>) sesion.getAttribute("lista");
		switch (oro) {
		case 1:
			numRandom=(int) (Math.random()*11 +10);
			System.out.println(numRandom);
			suma+= numRandom;
			sesion.setAttribute("suma", suma);
			reg.add("<span class='text-success'> You entered a farm and earned "+numRandom+" gold. ("+fechaFormateada+")</span>");
			sesion.setAttribute("lista", reg);
			System.out.println(reg);
			break;
		case 2:
			numRandom=(int) (Math.random()*6 +5);
			System.out.println(numRandom);
			suma+= numRandom;
			sesion.setAttribute("suma", suma);
			reg.add("<span class='text-success'>You entered a cave and earned "+numRandom+" gold. ("+fechaFormateada+")</span>");
			sesion.setAttribute("lista", reg);
			System.out.println(reg);
			break;
		case 3:
			numRandom=(int) (Math.random()*4 +2);
			System.out.println(numRandom);
			suma+= numRandom;
			sesion.setAttribute("suma", suma);
			reg.add("<span class='text-success'>You entered a Hause and earned "+numRandom+" gold. ("+fechaFormateada+")</span>");
			sesion.setAttribute("lista", reg);
			System.out.println(reg);
			break;
		case 4:
			numRandom=(int) (Math.random()*101 -50);
			System.out.println(numRandom);
			suma+= numRandom;
			sesion.setAttribute("suma", suma);
			
			if(numRandom >= 0) {
				reg.add("<span class='text-success'>You entered a casino and earned "+numRandom+" gold. Yeah! ("+fechaFormateada+")</span>");
			}else {
				reg.add("<span class='text-danger'>You entered a casino and lost "+numRandom+" gold... Ouch ("+fechaFormateada+")</span>");
			}
			sesion.setAttribute("lista", reg);
			System.out.println(reg);
			break;

		default:
			break;
		}
		return "index";
	}
}
