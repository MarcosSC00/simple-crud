package com.myprojects.simplecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.simplecrud.entity.Usuario;
import com.myprojects.simplecrud.repository.UsuarioRepository;

import java.util.List;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository uRep;
	
	@GetMapping(value="listar-todos")
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> usuarios = uRep.findAll();
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
	
	@GetMapping(value="buscar-por-nome")
	public ResponseEntity<List<Usuario>> findByName(@RequestParam String nome){
		List<Usuario> usuarios = uRep.findByNomeContainingIgnoreCase(nome);
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
	
	@PostMapping(value="salvar")
	public ResponseEntity<Usuario> salve(@RequestBody Usuario usuario){
		Usuario user = uRep.save(usuario);
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
	}
	
	@DeleteMapping(value="deletar")
	public ResponseEntity<String> delete(@RequestParam Long id){
		uRep.deleteById(id);
		return new ResponseEntity<String>("Usuário "+id+" deletado!", HttpStatus.OK);
	}
	
	@GetMapping(value="buscar-por-id")
	public ResponseEntity<Usuario> findById(@RequestParam Long id){
		Usuario user = uRep.findById(id).get();
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
	}
	
	@PutMapping(value="atualizar")
	public ResponseEntity<?> update(@RequestBody Usuario usuario){
		if(usuario.getId() == null) {
			return new ResponseEntity<String>("id do usuario não foi informado!", HttpStatus.OK);
		}
		Usuario user = uRep.saveAndFlush(usuario);
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
	}
}
