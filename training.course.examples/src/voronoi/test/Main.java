package voronoi.test;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import voronoi.DistanceStandard;
import voronoi.Grid;
import voronoi.Point;
import voronoi.VoronoiDiagram;
import voronoi.VoronoiFactory;
import voronoi.VoronoiPackage;
import voronoi.visualization.Visualizer;

public class Main {
	  
  public static void main(String[] args) {  
      VoronoiPackage pkg = VoronoiPackage.eINSTANCE;
      VoronoiFactory factory = VoronoiFactory.eINSTANCE;
      
      // Create diagram
      VoronoiDiagram diagram = factory.createVoronoiDiagram();
      
      // Create islands
      Point island1 = factory.createPoint();
      island1.setX(0.5);
      island1.setY(0.5);
      
      Point island2 = factory.createPoint();
      island2.setX(0.2);
      island2.setY(0.1);
      
      Point island3 = factory.createPoint();
      island3.setX(0.6);
      island3.setY(0.8);
      
      Point island4 = factory.createPoint();
      island4.setX(0.7);
      island4.setY(0.5);
      
      Point island5 = factory.createPoint();
      island5.setX(0.2);
      island5.setY(0.6);
      
      diagram.getIslands().add(island1);
      diagram.getIslands().add(island2);
      diagram.getIslands().add(island3);
      diagram.getIslands().add(island4);
      diagram.getIslands().add(island5);
      
      // Create distance standard
      DistanceStandard standard = factory.createDescartes();
      diagram.setStandard(standard);
      
      // Create grid
      int numCols = 100;
      int numRows = 100;
      Grid grid = factory.createGrid();
      grid.setNumCols(numCols);
      grid.setNumRows(numRows);
      diagram.setGrid(grid);
      
      // Create points in grid
      for (int i=0; i<numCols; i++) {
    	  for (int j=0; j<numRows; j++) {
    		  Point point = factory.createPoint();
    		  point.setX( i * diagram.getWidth()/numCols );
    		  point.setY( j * diagram.getLength()/numRows );
    		  point.setZ( 0 );
    		  grid.getPoints().add(point);
    	  }
      }
      
      // Do fragment
      diagram.computeCells();
      
      // Visualize
      diagram.visualize();
  }  
}
