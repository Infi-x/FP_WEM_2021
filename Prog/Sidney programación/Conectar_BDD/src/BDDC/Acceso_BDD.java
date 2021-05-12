/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDC;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dedei
 */
public class Acceso_BDD {

    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String pass = "alumno2021";
    private static final String url = "jdbc:mysql://localhost:3306/agenda";
    private boolean estado=false;
    public Acceso_BDD() {
    }

    public String Conectar() {
        con = null;
        String aux = "";
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion establecida
            if (con != null) {
                aux += "Conexion establecida";
                estado=true;
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e) {
            aux += "Error de conexion: \n" + e;
        }
        return aux;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public String hacerConsultaContactos() {
        String aux = "";
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM CONTACTOS");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                aux += "ID: " + rs.getString("ID") + " Nombre: " + rs.getString("NOMBRE") + " Ciudad: " + rs.getString("CIUDAD") + "\n";
            }
        } catch (SQLException sqle) {
            aux += "Consulta no realizada";
        }
        return aux;
    }

    public String hacerConsultaCorreos() {
        String aux = "";
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM CORREOS");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                aux += "Correo ID: " + rs.getInt("CORREO_ID") + " ID Contacto: " + rs.getInt("ID_CONTACTO") + " Correo: " + rs.getString("CORREO") + "\n";
            }
        } catch (SQLException sqle) {
            aux += "Consulta no realizada";
        }
        return aux;
    }

    public String hacerConsultaTelefonos() {
        String aux = "";
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM TELEFONOS");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                aux += "Telefono ID: " + rs.getInt("TELEFONO_ID") + " ID Contacto: " + rs.getInt("ID_CONTACTO") + " Telefono: " + rs.getString("TELEFONO") + "\n";
            }
        } catch (SQLException sqle) {
            aux += "Consulta no realizada";
        }
        return aux;
    }

    public boolean insertarContactos(String n, String c) {
        try {
            PreparedStatement stmt = stmt = con.prepareStatement("INSERT INTO CONTACTOS VALUES (?,?,?)");
            stmt.setInt(1, cuantosRegistros("CONTACTOS") + 1);
            stmt.setString(2, n.toUpperCase());
            stmt.setString(3, c.toUpperCase());
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            return false;
        }
        return true;

    }

    public boolean update(String uno, String dos, String tres, String cuatro) {
        try {
            PreparedStatement stmt = stmt = con.prepareStatement("UPDATE "+cuatro.toUpperCase()+" SET "+uno+"=? WHERE "+uno+"=?");
            stmt.setString(1, dos.toUpperCase());
            stmt.setString(2, tres.toUpperCase());
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            return false;
        }
        return true;

    }
    
    public boolean delete(int id) {
        try {
            
            PreparedStatement stmtt = con.prepareStatement("DELETE FROM TELEFONOS WHERE ID_CONTACTO=?");
            PreparedStatement stmtc = con.prepareStatement("DELETE FROM CORREOS WHERE ID_CONTACTO=?");
            PreparedStatement stmt  = con.prepareStatement("DELETE FROM CONTACTOS WHERE ID=?");
            stmtt.setInt(1, id);
            stmtc.setInt(1,id);
            stmt.setInt(1, id);
            stmtt.execute();
            stmtc.execute();
            stmt.execute();
        } catch (SQLException sqle) {
            return false;
        }
        return true;

    }
    
    public boolean insertarCorreos(int id, String c) {
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO CORREOS VALUES(?,?,?)");
            stmt.setInt(1, cuantosRegistros("CORREOS") + 1);
            stmt.setInt(2, id);
            stmt.setString(3, c);
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            return false;
        }
        return true;

    }

    public boolean insertarTelefonos(int id, String c) {
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO TELEFONOS VALUES(?,?,?)");
            stmt.setInt(1, cuantosRegistros("TELEFONOS") + 1);
            stmt.setInt(2, id);
            stmt.setString(3, c);
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            return false;
        }
        return true;

    }

    public String ConsultaPorPersona(String n) {
        String aux = "";
        try {
            PreparedStatement stmt1 = con.prepareStatement("Select id,nombre,ciudad from contactos\n"
                    + "where nombre=\"" + n + "\";");
            PreparedStatement stmt2 = con.prepareStatement("Select telefono from contactos as c, telefonos as t\n"
                    + "where  c.id=t.ID_CONTACTO and nombre=\"" + n + "\";");
            PreparedStatement stmt3 = con.prepareStatement("Select correo from contactos as c, correos as t\n"
                    + "where  c.id=t.ID_CONTACTO and nombre=\"" + n + "\";");
            ResultSet rs = stmt1.executeQuery();
            while (rs.next()) {
                aux += "ID: " + rs.getInt("ID") + " Nombre: " + rs.getString("NOMBRE") + " Ciudad: " + rs.getString("CIUDAD") + "\n";
            }
            rs = stmt2.executeQuery();
            int cont = 0;
            aux += "Teléfonos registrados: \n";
            while (rs.next()) {
                aux += rs.getString("TELEFONO") + "\n";
                cont++;
            }
            if (cont == 0) {
                aux += "Ninguno\n";
            }
            cont = 0;
            rs = stmt3.executeQuery();
            aux += "Correos registrados: \n";
            while (rs.next()) {
                aux += rs.getString("CORREO") + "\n";
                cont++;
            }
            if (cont == 0) {
                aux += "Ninguno\n";
            }
            cont = 0;
        } catch (SQLException sqle) {
            aux += "Consulta no realizada";
        }
        if (aux.equalsIgnoreCase("Teléfonos registrados: \nNinguno\nCorreos registrados: \nNinguno\n")) {
            aux = "Consulta no realizada";
        }
        return aux;
    }

    public void cerrar() {
        try {
            con.close();
        } catch (SQLException sqle) {
        }
    }

    public int cuantosRegistros(String t) {
        int cont = 0;

        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM " + t);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cont++;
            }
        } catch (SQLException sqle) {
            cont = -1;
        }
        return cont;
    }
}
