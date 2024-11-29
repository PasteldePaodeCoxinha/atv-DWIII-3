package com.autobots.automanager.modelo;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Usuario;
import com.autobots.automanager.repositorios.UsuarioRepositorio;

@Component
public class ClienteSelecionador {
	public Usuario selecionar(UsuarioRepositorio bancoCliente, long id) {
		Usuario selecionado = bancoCliente.findById(id).orElseGet(null);
		return selecionado;
	}
}