package controller;


import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    //GET/ usuarios - listar todos
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    //GET /usuarios/{id} - buscar por ID
    @GetMapping("/{id}")
    public Optional<Usuario> buscarUsuarioPorId(@PathVariable Integer id) {
        return usuarioService.buscarUsuarioPorId(id);
    }

    //POST /usuarios - criar novo
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return usuarioService.criarUsuario(usuario);
    }

    //PUT /usuario/{id} - atualizar existente
    @PutMapping("/{id}")
    public Usuario atualizarUsuario (@PathVariable Integer id, @RequestBody Usuario usuario){
        return usuarioService.atualizarUsuario(id, usuario);
    }

    //DELETE /usuario/{id} - deletar usuário
    @DeleteMapping
    public void deletarUsuario(@PathVariable Integer id) {
        usuarioService.deletarUsuario(id);
    }


}
