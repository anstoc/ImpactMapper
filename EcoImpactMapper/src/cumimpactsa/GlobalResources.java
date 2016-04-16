/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cumimpactsa;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ast
 */
public abstract class GlobalResources 
{
    public static MappingProject mappingProject=new MappingProject();
    
    public static final double NODATAVALUE=-9999; //keep negative for proper function
    public static final int DATATYPE_STRESSOR=1;
    public static final int DATATYPE_ECOCOMP=2; 
    public static final int DATATYPE_PROCESSINGCHAINS=3;
    public static final int DATATYPE_SPATIAL=4;
    public static final int DATATYPE_FREQUENCY=5;
    public static final int DATATYPE_REGIONS = 6;
    public static String lastUsedFolder=System.getProperty("user.home");
    public static CsvTableFloat lastOpenedTable = null;
    public static String lastOpenedTableFile = "";
    public static final String SPATIALDATATYPE_POINT = "point";
    public static final String SPATIALDATATYPE_LINE = "line";
    public static final String SPATIALDATATYPE_POLYGON = "polygon";
    public static final String SPATIALDATATYPE_SURFACE = "surface"; 
    public static final String SPATIALDATATYPE_UNKNOWN = "unknown";
    
    /*private static int[] workerCodes=new int[1];

    private static int rasterXDim=-1;
    private static int rasterYDim=-1;
    
    public static void initializeWorkerCodes(int size)
    {
        workerCodes=new int[10];
    }
    
    public static synchronized void setWorkerCode(int worker, int code)
    {
        workerCodes[worker-1]=code;
    }
    
    public static synchronized int[] getWorkerCodes()
    {
        return workerCodes;
    }
    
    public static synchronized int getRasterXDim()
    {
        return rasterXDim;
    }
    public static synchronized int getRasterYDim()
    {
        return rasterYDim;
    }
    public static synchronized void setRasterXDim(int xDim)
    {
        rasterXDim=xDim;
    }
    public static synchronized void setRasterYDim(int yDim)
    {
        rasterYDim=yDim;
    }*/
    
    
    public static String getDateTime()
    {
      return new SimpleDateFormat("yyyyMMdd HH:mm").format(Calendar.getInstance().getTime());
    }
    
}