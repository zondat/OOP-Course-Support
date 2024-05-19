package voronoi.visualization;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import javax.swing.WindowConstants;  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.XYPlot;  
import org.jfree.data.xy.XYDataset;  
import org.jfree.data.xy.XYSeries;  
import org.jfree.data.xy.XYSeriesCollection;

import voronoi.Cell;
import voronoi.Point;  
  
public class Visualizer extends JFrame {  
	private static final long serialVersionUID = 6294689542092367723L;  
  
	private String appTitle;
	private String chartTitle;
	private String xLabel;
	private String yLabel;
  
	public Visualizer(String title) {  
	    super(title);  
	}  	
	
	public void visualize(List<Cell> cells) {
		// create data set
	    XYSeriesCollection dataset = new XYSeriesCollection();  
	    
	    int i=0;
	    for (Cell cell : cells) {
	    	XYSeries series = new XYSeries("" + (i++));
	    	for (Point point : cell.getInnerPoints()) {
	    		series.add(point.getX(), point.getY());
	    	}
	    	dataset.addSeries(series);
	    }
	   	  
	    // Create chart  
	    JFreeChart chart = ChartFactory.createScatterPlot(  
	        "Voronoi Diagram",   
	        "X", "Y", dataset);  
	      
	    //Changes background color  
	    XYPlot plot = (XYPlot)chart.getPlot();  
	    plot.setBackgroundPaint(new Color(255,228,196));  
	      
	     
	    // Create Panel  
	    ChartPanel panel = new ChartPanel(chart);  
	    setContentPane(panel);      
	}
	
	
	public String getAppTitle() {
		return appTitle;
	}

	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}

	public String getChartTitle() {
		return chartTitle;
	}

	public void setChartTitle(String chartTitle) {
		this.chartTitle = chartTitle;
	}

	public String getxLabel() {
		return xLabel;
	}

	public void setxLabel(String xLabel) {
		this.xLabel = xLabel;
	}

	public String getyLabel() {
		return yLabel;
	}

	public void setyLabel(String yLabel) {
		this.yLabel = yLabel;
	}

}  