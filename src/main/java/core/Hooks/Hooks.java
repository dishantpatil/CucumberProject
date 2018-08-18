package core.Hooks;
import core.generic.StepBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @ScriptName    : Hooks
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 25 Dec 2017   @Modified Date:                       
 */
public class Hooks 
{
	public Scenario currentScenario;
	StepBase objStepBase = new StepBase();
	
	@Before
	public void applyHook(Scenario scenario)
	{
		currentScenario = scenario;
		objStepBase.setUp(scenario);
	}

//	@Before(order=1)
//	public void applyHook1(Scenario scenario1)
//	{
//		currentScenario = scenario1;
//		objStepBase.setUp1(scenario1);
//	}

	@After
	public void removeHook(Scenario scenario) 
	{
		objStepBase.tearDown(scenario);
	}	
}
