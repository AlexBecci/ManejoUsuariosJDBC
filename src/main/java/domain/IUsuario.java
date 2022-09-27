package domain;

import java.util.*;

public interface IUsuario {

    public static final String SQL_SELECT = "SELECT id_usuario,username,password FROM test.usuario";
    public static final String SQL_INSERT = "INSERT INTO usuario(username,password) VALUES(?,?)";
    public static final String SQL_UPDATE = "UPDATE test.usuario SET username = ?, password = ? WHERE id_usuario = ?";
    public static final String SQL_DELETE = "DELETE from test.usuario WHERE id_usuario = ?";

    public List<Usuario> SELECT();

    public int UPDATE(Usuario usuario);

    public int INSERT(Usuario usuario);

    public int DELETE(Usuario usuario);

}
