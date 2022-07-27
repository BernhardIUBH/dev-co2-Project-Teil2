import java.io.Serializable;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ChartBean implements Serializable {
    private LineChartModel lineModel1;
    
    public LineChartModel lineModel(int id) {
    	createLineModel(id);
        return lineModel1;
    }

    private void createLineModel(int id) {
        lineModel1 = initLinearModel(id);
    }

    private LineChartModel initLinearModel(int id) {
    	
        LineChartModel model = new LineChartModel();
        LineChartSeries series1 = new LineChartSeries();
        
        series1.set(1990, Overview.getInstance().getListEntries().get(id).getCo2Wert1990());
        series1.set(1991, Overview.getInstance().getListEntries().get(id).getCo2Wert1991());
        series1.set(1992, Overview.getInstance().getListEntries().get(id).getCo2Wert1992());
        series1.set(1993, Overview.getInstance().getListEntries().get(id).getCo2Wert1993());
        series1.set(1994, Overview.getInstance().getListEntries().get(id).getCo2Wert1994());
        series1.set(1995, Overview.getInstance().getListEntries().get(id).getCo2Wert1995());
        series1.set(1996, Overview.getInstance().getListEntries().get(id).getCo2Wert1996());
        series1.set(1997, Overview.getInstance().getListEntries().get(id).getCo2Wert1997());
        series1.set(1998, Overview.getInstance().getListEntries().get(id).getCo2Wert1998());
        series1.set(1999, Overview.getInstance().getListEntries().get(id).getCo2Wert1999());
        series1.set(2000, Overview.getInstance().getListEntries().get(id).getCo2Wert2000());
        series1.set(2001, Overview.getInstance().getListEntries().get(id).getCo2Wert2001());
        series1.set(2002, Overview.getInstance().getListEntries().get(id).getCo2Wert2002());
        series1.set(2003, Overview.getInstance().getListEntries().get(id).getCo2Wert2003());
        series1.set(2004, Overview.getInstance().getListEntries().get(id).getCo2Wert2004());
        series1.set(2005, Overview.getInstance().getListEntries().get(id).getCo2Wert2005());
        series1.set(2006, Overview.getInstance().getListEntries().get(id).getCo2Wert2006());
        series1.set(2007, Overview.getInstance().getListEntries().get(id).getCo2Wert2007());
        series1.set(2008, Overview.getInstance().getListEntries().get(id).getCo2Wert2008());
        series1.set(2009, Overview.getInstance().getListEntries().get(id).getCo2Wert2009());
        series1.set(2010, Overview.getInstance().getListEntries().get(id).getCo2Wert2010());
        series1.set(2011, Overview.getInstance().getListEntries().get(id).getCo2Wert2011());
        series1.set(2012, Overview.getInstance().getListEntries().get(id).getCo2Wert2012());
        series1.set(2013, Overview.getInstance().getListEntries().get(id).getCo2Wert2013());
        series1.set(2014, Overview.getInstance().getListEntries().get(id).getCo2Wert2014());
        series1.set(2015, Overview.getInstance().getListEntries().get(id).getCo2Wert2015());
        series1.set(2016, Overview.getInstance().getListEntries().get(id).getCo2Wert2016());
        series1.set(2017, Overview.getInstance().getListEntries().get(id).getCo2Wert2017());
        series1.set(2018, Overview.getInstance().getListEntries().get(id).getCo2Wert2018());
        series1.set(2019, Overview.getInstance().getListEntries().get(id).getCo2Wert2019());

        model.addSeries(series1);
        return model;
    }
}