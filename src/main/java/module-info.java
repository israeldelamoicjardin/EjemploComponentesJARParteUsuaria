module es.israeldelamo.ejemplodeusocomponentessimples {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.israeldelamo.componentesimple;


    opens es.israeldelamo.ejemplodeusocomponentessimples to javafx.fxml;
    exports es.israeldelamo.ejemplodeusocomponentessimples;
}