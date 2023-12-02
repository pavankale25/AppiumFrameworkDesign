package Util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	ExtentSparkReporter reporter;
	public ExtentReports extent;
	public ExtentReports getReporterObject() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		reporter = new ExtentSparkReporter(path);   //helping class
		reporter.config().setDocumentTitle("Test results");
		reporter.config().setReportName("Automation report");
		reporter.config().setTimelineEnabled(Boolean.TRUE);
		reporter.config().setOfflineMode(Boolean.TRUE);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");//day, month, date, year, hours:minute pm/am (IST)
		reporter.config().setTimelineEnabled(Boolean.TRUE);
		
		extent = new ExtentReports();    //main class
		extent.attachReporter(reporter);   //report attach
		extent.setSystemInfo("User name", "Pavan Kale");
		extent.setSystemInfo("Platform", "Windows");
		extent.setSystemInfo("URL","https://rahulshettyacademy.com");
		extent.setSystemInfo("Browser","Chrome/Edge");
		extent.setSystemInfo("User Name","Pavan Kale");
		
		return extent;
	}

}
