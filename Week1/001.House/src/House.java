import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import org.jfree.fx.FXGraphics2D;

import java.awt.geom.Line2D;

public class House extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(800, 500);
        draw(new FXGraphics2D(canvas.getGraphicsContext2D()));
        primaryStage.setScene(new Scene(new Group(canvas)));
        primaryStage.setTitle("House");
        primaryStage.show();
    }


    public void draw(FXGraphics2D graphics) {
        graphics.draw(new Line2D.Double(400, 30, 250, 230));
        graphics.draw(new Line2D.Double(400, 30, 550, 230));
        // dak
        graphics.draw(new Line2D.Double(250, 230, 250, 450));
        graphics.draw(new Line2D.Double(550, 230, 550, 450));
        // muren
        graphics.draw(new Line2D.Double(550, 450, 250, 450));
        // vloer
        graphics.draw(new Line2D.Double(290, 450, 290, 320));
        graphics.draw(new Line2D.Double(350, 450, 350, 320));
        graphics.draw(new Line2D.Double(290, 320, 350, 320));
        // deur
        graphics.draw(new Line2D.Double(390, 380, 510, 380 ));
        graphics.draw(new Line2D.Double(390, 290, 510, 290 ));
        graphics.draw(new Line2D.Double(390, 380, 390, 290 ));
        graphics.draw(new Line2D.Double(510, 380, 510, 290 ));
        // raam
    }



    public static void main(String[] args) {
        launch(House.class);
    }

}
