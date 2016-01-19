package br.com.java8example.foreach.main;

import br.com.java8example.foreach.consumer.UsuarioConsumer;
import br.com.java8example.foreach.model.Usuario;

import java.util.Arrays;
import java.util.List;

/**
 * Created by thiago on 18/01/16.
 */
public class ForEach {

    public static void iniciarForEachComListaUsuario() {
        List<Usuario> usuarios = Arrays.asList(new Usuario("Thiago", 29),
                new Usuario("José", 20),
                new Usuario("Maria", 31));
        inativarUsuariosMairesQue30Anos(usuarios);
    }

    private static void inativarUsuariosMairesQue30Anos(List<Usuario> usuarios) {
        usuarios.forEach(new UsuarioConsumer());
    }
}
