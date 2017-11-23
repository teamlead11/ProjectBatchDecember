package com.resources;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

import gherkin.formatter.Formatter;
import gherkin.formatter.Reporter;
import gherkin.formatter.model.Background;
import gherkin.formatter.model.DataTableRow;
import gherkin.formatter.model.Examples;
import gherkin.formatter.model.ExamplesTableRow;
import gherkin.formatter.model.Feature;
import gherkin.formatter.model.Match;
import gherkin.formatter.model.Result;
import gherkin.formatter.model.Scenario;
import gherkin.formatter.model.ScenarioOutline;
import gherkin.formatter.model.Step;
import gherkin.formatter.model.Tag;

/**
 * A cucumber based reporting listener which generates the Extent Report
 */
public class ExtentCucumberFormatter implements Reporter, Formatter {

	private static ExtentReports extentReports;
	private static ExtentHtmlReporter htmlReporter;
	private static ThreadLocal<ExtentTest> featureTestThreadLocal = new InheritableThreadLocal<>();
	private static ThreadLocal<ExtentTest> scenarioOutlineThreadLocal = new InheritableThreadLocal<>();
	static ThreadLocal<ExtentTest> scenarioThreadLocal = new InheritableThreadLocal<>();
	private static ThreadLocal<LinkedList<Step>> stepListThreadLocal = new InheritableThreadLocal<>();
	static ThreadLocal<ExtentTest> stepTestThreadLocal = new InheritableThreadLocal<>();
	private boolean scenarioOutlineFlag;

	public ExtentCucumberFormatter(File file) {
		setExtentHtmlReport(file);
		setExtentReport();
		stepListThreadLocal.set(new LinkedList<Step>());
		scenarioOutlineFlag = false;
	}

	public static void setExtentHtmlReport(File file) {
		if (htmlReporter != null) {
			return;
		}
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
		htmlReporter = new ExtentHtmlReporter(file);
	}

	static ExtentHtmlReporter getExtentHtmlReport() {
		return htmlReporter;
	}

	private static void setExtentReport() {
		if (extentReports != null) {
			return;
		}
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
		//uncomment the below step when DB report is needed
		//extentReports.attachReporter(htmlReporter,getExtentXReporter());
	}

	static ExtentReports getExtentReport() {
		return extentReports;
	}

	public void syntaxError(String state, String event, List<String> legalEvents, String uri, Integer line) {

	}

	public void uri(String uri) {

	}

	public void feature(Feature feature) {
		featureTestThreadLocal.set(getExtentReport().createTest(feature.getName()));
		ExtentTest test = featureTestThreadLocal.get();

		for (Tag tag : feature.getTags()) {
			test.assignCategory(tag.getName());
		}
	}

	public void scenarioOutline(ScenarioOutline scenarioOutline) {
		scenarioOutlineFlag = true;
		ExtentTest node = featureTestThreadLocal.get()
				.createNode(scenarioOutline.getKeyword() + ": " + scenarioOutline.getName());
		scenarioOutlineThreadLocal.set(node);
	}

	public void examples(Examples examples) {
		ExtentTest test = scenarioOutlineThreadLocal.get();

		String[][] data = null;
		List<ExamplesTableRow> rows = examples.getRows();
		int rowSize = rows.size();
		for (int i = 0; i < rowSize; i++) {
			ExamplesTableRow examplesTableRow = rows.get(i);
			List<String> cells = examplesTableRow.getCells();
			int cellSize = cells.size();
			if (data == null) {
				data = new String[rowSize][cellSize];
			}
			for (int j = 0; j < cellSize; j++) {
				data[i][j] = cells.get(j);
			}
		}
		test.info(MarkupHelper.createTable(data));
	}

	public void startOfScenarioLifeCycle(Scenario scenario) {
		if (scenarioOutlineFlag) {
			scenarioOutlineFlag = false;
		}

		ExtentTest scenarioNode;
		if (scenarioOutlineThreadLocal.get() != null
				&& scenario.getKeyword().trim().equalsIgnoreCase("Scenario Outline")) {
			scenarioNode = scenarioOutlineThreadLocal.get().createNode("Scenario: " + scenario.getName());
		} else {
			scenarioNode = featureTestThreadLocal.get().createNode("Scenario: " + scenario.getName());
		}

		for (Tag tag : scenario.getTags()) {
			scenarioNode.assignCategory(tag.getName());
		}
		scenarioThreadLocal.set(scenarioNode);
	}

	public void background(Background background) {

	}

	public void scenario(Scenario scenario) {

	}

	public void step(Step step) {
		if (scenarioOutlineFlag) {
			return;
		}
		stepListThreadLocal.get().add(step);
	}

	public void endOfScenarioLifeCycle(Scenario scenario) {

	}

	public void done() {
		getExtentReport().flush();
	}

	public void close() {

	}

	public void eof() {

	}

	public void before(Match match, Result result) {

	}

	public void result(Result result) {
		if (scenarioOutlineFlag) {
			return;
		}

		if (Result.PASSED.equals(result.getStatus())) {
			stepTestThreadLocal.get().pass(Result.PASSED);
		} else if (Result.FAILED.equals(result.getStatus())) {
			stepTestThreadLocal.get().fail(result.getError());
			stepTestThreadLocal.get().fail(result.getStatus());
		} else if (Result.SKIPPED.equals(result)) {
			stepTestThreadLocal.get().skip(Result.SKIPPED.getStatus());
		} else if (Result.UNDEFINED.equals(result)) {
			stepTestThreadLocal.get().skip(Result.UNDEFINED.getStatus());
		}
	}

	public void after(Match match, Result result) {

	}

	public void match(Match match) {
		Step step = stepListThreadLocal.get().poll();
		String data[][] = null;
		if (step.getRows() != null) {
			List<DataTableRow> rows = step.getRows();
			int rowSize = rows.size();
			for (int i = 0; i < rowSize; i++) {
				DataTableRow dataTableRow = rows.get(i);
				List<String> cells = dataTableRow.getCells();
				int cellSize = cells.size();
				if (data == null) {
					data = new String[rowSize][cellSize];
				}
				for (int j = 0; j < cellSize; j++) {
					data[i][j] = cells.get(j);
				}
			}
		}

		ExtentTest scenarioTest = scenarioThreadLocal.get();
		ExtentTest stepTest = scenarioTest.createNode(step.getKeyword() + step.getName());

		if (data != null) {
			Markup table = MarkupHelper.createTable(data);
			stepTest.info(table);
		}

		stepTestThreadLocal.set(stepTest);
	}

	public void embedding(String mimeType, byte[] data) {

	}

	public void write(String text) {

	}
	
private static ExtentXReporter getExtentXReporter() {
    	
        ExtentXReporter extentx = new ExtentXReporter("10.28.177.64", 27017);

        // project name
        //extentx.config().setProjectName("test11");
        extentx.config().setProjectName("AccountReceivables");

        // report or build name
        extentx.config().setReportName("build#01");

        // server URL
        // ! must provide this to be able to upload snapshots
        extentx.config().setServerUrl("http://10.28.177.64:1337");

        return extentx;
    }
}
