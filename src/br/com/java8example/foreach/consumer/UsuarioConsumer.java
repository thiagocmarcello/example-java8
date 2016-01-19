package br.com.java8example.foreach.consumer;

import br.com.java8example.foreach.model.Usuario;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by thiago on 18/01/16.
 */
public class UsuarioConsumer implements Consumer<Usuario> {

    @Override
    public void accept(Usuario usuario) {
        inativarUsuarioMaiorQue30Anos(usuario);
    }

    private void inativarUsuarioMaiorQue30Anos(Usuario usuario) {
        Optional<Usuario> user = usuario != null ? Optional.of(usuario) : Optional.empty();
        user.filter(u -> u.getIdade() > 30)
                .map(this::inativar);
    }

    private Usuario inativar(Usuario usuario) {
        usuario.setAtivo(false);
        System.out.printf("Usuario: " + usuario.getNome() + " foi inativado com sucesso!");
        return usuario;
    }
}
