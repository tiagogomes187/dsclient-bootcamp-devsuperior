package com.devsuperior.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "João Silva", "111.333.888-08", 1900.00, Instant.now(), 3));
		list.add(new Client(2L, "Maria Silva", "111.333.888-08", 1900.00, Instant.now(), 3));
		list.add(new Client(3L, "Joaquim Silva", "111.333.888-08", 1900.00, Instant.now(), 3));
		return ResponseEntity.ok().body(list);

	}

}
