package testDemo1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("OnTestStart-> Test Name "+ result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("OnTestFailure-> Test Name "+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTestSkipped-> Test Name "+result.getName());
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart-> Test Name "+context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		for(ITestNGMethod method: methods) {
			System.out.println(method.getMethodName());
		}
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("noFinish-> Test Name "+context.getName());
	}
}
