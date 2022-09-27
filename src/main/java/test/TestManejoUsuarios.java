package test;

import domain.Usuario;
import datos.UsuarioDAO;
import datos.*;
import domain.*;
import java.util.*;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        //INSERTANDO UN OBJETO DE TIPO USUARIO A LA BASE DE DATOS
        Usuario usuarioNuevo = new Usuario("Lour", "1715");
        usuarioDao.INSERT(usuarioNuevo);

        //MODIFICANDO UN OBJETO DE TIPO USUARIO
        Usuario usuarioModificado = new Usuario(1, "Brian", "Pepito2222");
        usuarioDao.UPDATE(usuarioModificado);

        //ELIMINANDO UN OBJETO DE TIPO USUARIO EXISTENTE
        Usuario usuarioEliminado = new Usuario(1);
        usuarioDao.DELETE(usuarioEliminado);

        //ACTUALIZANDO UN OBJETO DE TIPO USUARIO EXISTENTE
        Usuario usuarioEditar = new Usuario(2, "Alex", "2002");
        usuarioDao.UPDATE(usuarioEditar);

        //LISTADO DE USUARIOS
        List<Usuario> usuarios = usuarioDao.SELECT();
        usuarios.forEach(usuario
                -> {
            System.out.println("Persona: " + usuario);
        });

    }
}
