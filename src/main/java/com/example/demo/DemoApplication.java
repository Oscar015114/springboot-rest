package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
//List alumno = new ArrayList<String>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String name1(){
 return "hola rest1";
	}

	@RequestMapping(value="/alumnos", method = RequestMethod.POST)
	public String name2(){
 return "alumno creado";
	}

	@RequestMapping(value= "/alumnos", method= RequestMethod.DELETE)
	public String name3(){
 return "alumno borrado";
	}
    
	@RequestMapping(value="/alumnos", method = RequestMethod.GET)
	public ArrayList<Alumnos> name4(){
		ArrayList<Alumnos> alumno = new ArrayList<Alumnos>();
		Alumnos a = new Alumnos("pepito",13);
		Alumnos b = new Alumnos("fulanito", 17);
        alumno.add(a);
		alumno.add(b);

		return alumno;
	
	}
	//curl -i localhost 8080
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String saludarGet(){
		return "mensaje d tipo get";
	}

	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public String saludarPost(){
		return "mensaje d tipo post";
	}

}
