package service;


import jakarta.persistence.criteria.CriteriaBuilder;
import model.Usuario;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

  //Injeção do repository via construtor
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //Metodo para listar todos os usários
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    //Metodo para buscar um usuário pelo Id
    public Optional<Usuario> buscarUsuarioPorId(Integer id) {
        return usuarioRepository.findById(id);
    }

    //Metodo para criar um novo usuário
    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //Metodo para atualizar um usuário existente
    public Usuario atualizarUsuario(Integer id, Usuario usuarioAtualizado){
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if(usuarioOptional.isPresent()) {
            Usuario usuarioExistente = usuarioOptional.get();
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());
            usuarioExistente.setSenha(usuarioAtualizado.getSenha());
            return usuarioRepository.save(usuarioExistente);
        }
        else {
            return null;
        }
    }

    //Metodo para deletar um usuário
    public void deletarUsuario(Integer id){
        usuarioRepository.deleteById(id);
    }






}
