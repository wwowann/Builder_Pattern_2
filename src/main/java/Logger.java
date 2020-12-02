import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    protected int counter = 1;
    private static Logger logger = null;

    private Logger() {
        this.counter = counter;
    }

    public void log(String msg) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd-M-Y ' 'hh:mm:ss");
        System.out.println("[" + ft.format(date) + " " + counter++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

}
                    