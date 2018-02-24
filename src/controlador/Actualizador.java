package controlador;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Actualizador {

    public static boolean verificarConexion() {
        try {
            URL url = new URL("https://raw.githubusercontent.com/mirlino/My_java_repository/master/Version.txt");
            URLConnection con = url.openConnection();
            con.connect();
            return true;

        } catch (MalformedURLException ex) {
            return false;
//            Logger.getLogger(Actualizador.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
//            Logger.getLogger(Actualizador.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public static String obtenerVersion() {

        try {
            URL url = new URL("https://raw.githubusercontent.com/mirlino/My_java_repository/master/Version.txt");
            URLConnection con = url.openConnection();
            con.connect();
            return obtenerContenidoURL(url);

        } catch (MalformedURLException ex) {
            Logger.getLogger(Actualizador.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Actualizador.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public static String obtenerContenidoURL(URL url) {

        try {
            Scanner s = new Scanner(url.openStream()).useDelimiter("\\Z");
            String contenido = s.next();
            return contenido;

        } catch (IOException ex) {
            Logger.getLogger(Actualizador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void abrirEnlace(String url) {

        try {
            Desktop.getDesktop().browse(new URI(url));

        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Actualizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
