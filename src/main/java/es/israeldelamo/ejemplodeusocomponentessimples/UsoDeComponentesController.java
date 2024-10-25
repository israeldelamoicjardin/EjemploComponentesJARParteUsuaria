package es.israeldelamo.ejemplodeusocomponentessimples;


import javafx.event.ActionEvent;
import es.israeldelamo.componentesimple.ComponenteSimple;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Esta clase muestra el uso de los componentes simples mediate un par sencillo de controles
 */

public class UsoDeComponentesController {

    /**
     * EL primero de los componentes de ejemplo
     */
    @FXML
    private ComponenteSimple componente1;

    /**
     * El segundo de los componentes de ejemplo
     */
    @FXML
    private ComponenteSimple componente2;


    /**
     * Este procedimiento se lanza nada más dibujar el FXML
     * @param event
     */

    @FXML
    private void initialize(ActionEvent event){

        //asigno un nombre a cada componentesimple
        componente1.newText("HOLA");
        componente2.newText("ADIOS");


    }


}
