import java.awt.*;
import java.awt.geom.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import org.jfree.fx.FXGraphics2D;

public class Spiral extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(800, 500);
        draw(new FXGraphics2D(canvas.getGraphicsContext2D()));
        primaryStage.setScene(new Scene(new Group(canvas)));
        primaryStage.setTitle("Spiral");
        primaryStage.show();
    }


    public void draw(FXGraphics2D graphics) {
        graphics.translate(800/2, 500/2);
        graphics.scale( 1, -1);

        double resolution = 0.1;
        double scale = 150;
        for(double x1 = -10; x1 < 10; x1 += resolution) {
            double x2 = x1 + resolution;
            double y1 = formule(x1);
            double y2 = formula(x2);
            graphics.drawLine((int)(x1*scale), (int)(y1*scale), (int)(x2*scale), (int)(y2*scale));
        }
    }

    private double formule(double x) {
        int n = 1;
//        double x = n * Ø * cos(Ø);
        return x;
    }
    private double formula(double y) {
        int n = 1;
//        double y = n * Ø * sin(Ø);
        return y;
    }

    public static void main(String[] args) {
        launch(Spiral.class);
    }

}
